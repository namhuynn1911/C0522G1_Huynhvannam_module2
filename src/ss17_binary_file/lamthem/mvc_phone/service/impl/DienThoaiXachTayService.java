package ss17_binary_file.lamthem.mvc_phone.service.impl;

import ss17_binary_file.lamthem.mvc_phone.excption.SoDuongExecption;
import ss17_binary_file.lamthem.mvc_phone.model.DienThoaiXachTay;
import ss17_binary_file.lamthem.mvc_phone.model.Dienthoai;
import ss17_binary_file.lamthem.mvc_phone.service.IDienThoaiXachTayService;
import ss17_binary_file.lamthem.mvc_phone.utils.FormatName;
import ss17_binary_file.lamthem.mvc_phone.utils.ReadWriteDienThoai;
import ss17_binary_file.lamthem.mvc_phone.dethinganhang.exception.NotFountBankAccountException;
import ss17_binary_file.lamthem.mvc_phone.excption.QuocGiaXachTayException;

import java.util.List;
import java.util.Scanner;

public class DienThoaiXachTayService implements IDienThoaiXachTayService {
    private static final String PATH = "src/CaseStudy_Module2/mvc_phone/data/dienthoaixachtay/dienthoaixachtay.csv";
    private static final Scanner SCANNER = new Scanner(System.in);

    @Override
    public void add() {
        List<Dienthoai> dienThoaiXachTay = ReadWriteDienThoai.readDienThoai(PATH);

        int ma = dienThoaiXachTay.get(dienThoaiXachTay.size() - 1).getMa() + 1;

        System.out.println("nhập vào tên điện thoại:");
        String tenDienthoai = SCANNER.nextLine();

        int gia;
        while (true) {
            try {
                System.out.println("nhập vào giá:");
                gia = Integer.parseInt(SCANNER.nextLine());
                if (gia <= 0) {
                    throw new SoDuongExecption("giá phải lớn hơn 0");
                }
                break;
            } catch (SoDuongExecption e) {
                System.out.println(e.getMessage());
            }
        }

        int soLuong;
        while (true) {
            try {
                System.out.println("nhập vào số lượng điện thoại:");
                soLuong = Integer.parseInt(SCANNER.nextLine());
                if (soLuong <= 0) {
                    throw new SoDuongExecption("Số lượng phải lớn hơn 0");
                }
                break;
            } catch (SoDuongExecption e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("nhập vào nhà sản xuất: ");
        String tenSanXuat = SCANNER.nextLine();
        String nhaSanXuat = FormatName.getName(tenSanXuat);

        String quocGiaXachTay;
        while (true) {
            try {
                System.out.println("nhập vào quốc gai sách tay:");
                quocGiaXachTay = SCANNER.nextLine();
                if (quocGiaXachTay.matches("Việt nam")) {
                    throw new QuocGiaXachTayException("quốc gia xách tay phải ngoại trừ Việt nam");
                }
                break;
            } catch (QuocGiaXachTayException e) {
                System.out.println(e.getMessage());
            }
        }

        String trangThai = setTrangThai();

        dienThoaiXachTay.add(new DienThoaiXachTay(ma, tenDienthoai, gia, soLuong, nhaSanXuat, quocGiaXachTay,
                trangThai));
        ReadWriteDienThoai.writeDienThoaiFile(PATH, dienThoaiXachTay);
        System.out.println("thêm mới thành công");
    }

    public String setTrangThai() {
        do {
            System.out.println("TRẠNG THÁI\n" +
                    "1. Đã sửa chữa\n" +
                    "2. Chưa sữa chữa");
            int bienChon = 0;
            try {
                bienChon = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
            switch (bienChon) {
                case 1:
                    return "Đã sửa chữa";
                case 2:
                    return "Chưa sữa chữa";
                default:
                    System.out.println("bạn nhập sai yêu cầu nhập lại");
            }
        } while (true);
    }

    public void display() {
        List<Dienthoai> dienThoaiXachTay = ReadWriteDienThoai.readDienThoai(PATH);
        for (Dienthoai dienthoai : dienThoaiXachTay) {
            System.out.println(dienthoai);
        }
    }

    @Override
    public void remove() {
        List<Dienthoai> dienThoaiXachTay = ReadWriteDienThoai.readDienThoai(PATH);
        for (Dienthoai dienthoai : dienThoaiXachTay) {
            System.out.println(dienthoai);
        }
        int ma;
        boolean flag = false;
        do {
            System.out.println("nhập vào mã điện thoại cần xóa:");
            ma = Integer.parseInt(SCANNER.nextLine());
            for (Dienthoai dienthoaiXachTay : dienThoaiXachTay) {
                if (dienthoaiXachTay.getMa() == ma) {
                    System.out.println("bạn có chắc chắn muốn xóa hay không:\n" +
                            "1. Có\n" +
                            "2. Không");
                    int bienSoSanh = Integer.parseInt(SCANNER.nextLine());
                    if (bienSoSanh == 1) {
                        dienThoaiXachTay.remove(dienthoaiXachTay);
                        ReadWriteDienThoai.writeDienThoaiFile(PATH, dienThoaiXachTay);
                        System.out.println("xóa thành công");
                    }
                    flag = true;
                    break;
                }
            }
            try {
                if (!flag) {
                    throw new NotFountBankAccountException("mã điện thoại không tồn tại:");
                }
            } catch (NotFountBankAccountException e) {
                System.out.println(e.getMessage());
            }
        } while (!flag);

    }


    @Override
    public void find() {
        List<Dienthoai> dienThoaiXachTay = ReadWriteDienThoai.readDienThoai(PATH);
        System.out.println("Nhap id hoac ma ten dien thoai can tim kiem!!");
        String find = SCANNER.nextLine();
        boolean isFlag = false;
        for (Dienthoai dienthoai1 : dienThoaiXachTay) {
            if (dienthoai1.getTenDienthoai().equals(find) || Integer.toString(dienthoai1.getMa()).equals(find)) {
                System.out.println(dienthoai1);
                isFlag = true;
            }
        }
        if (!isFlag) {
            System.out.println("Khong tim thay!!");
        }

    }
}

