package ss17_binary_file.lamthem.mvc_phone.service.impl;

import ss17_binary_file.lamthem.mvc_phone.excption.SoDuongExecption;
import ss17_binary_file.lamthem.mvc_phone.model.DienThoaiChinhHang;
import ss17_binary_file.lamthem.mvc_phone.model.Dienthoai;
import ss17_binary_file.lamthem.mvc_phone.service.IDienThoaiChinhHangService;
import ss17_binary_file.lamthem.mvc_phone.utils.FormatName;
import ss17_binary_file.lamthem.mvc_phone.utils.ReadWriteDienThoai;
import ss17_binary_file.lamthem.mvc_phone.dethinganhang.exception.NotFountBankAccountException;


import java.util.List;
import java.util.Scanner;

public class DienThoaiChinhHangService implements IDienThoaiChinhHangService {
    private static final String PATH = "src/CaseStudy_Module2/mvc_phone/data/dienthoaichinhhang.csv";
    private static final Scanner SCANNER = new Scanner(System.in);

    @Override
    public void add() {
        List<Dienthoai> dienthoaiList = ReadWriteDienThoai.readDienThoai(PATH);

        int ma = dienthoaiList.get(dienthoaiList.size() - 1).getMa() + 1;

        System.out.println("nhập vào tên điện thoại:");
        String dienThoai=SCANNER.nextLine();
        String tenDienthoai = FormatName.getName(dienThoai);

        int gia;
        while (true) {
            try {
                System.out.println("nhập vào giá:");
                gia = Integer.parseInt(SCANNER.nextLine());
                if(gia<=0){
                    throw new SoDuongExecption("giá phải lướn hơn không");
                }
                break;
            }catch (SoDuongExecption e) {
                System.out.println(e.getMessage());
            }
        }

        int soLuong;
        while (true) {
            try {
                System.out.println("nhập vào số lượng điện thoại:");
                soLuong = Integer.parseInt(SCANNER.nextLine());
                if(soLuong<=0){
                    throw new SoDuongExecption("giá phải lướn hơn không");
                }
                break;
            }catch (SoDuongExecption e) {
                System.out.println(e.getMessage());
            }
        }


        System.out.println("nhập vào nhà sản xuất: ");
        String nhaSanXuat = SCANNER.nextLine();


        int thoiGianBaoHanh;
        while (true) {
            try {
                System.out.println("nhập vào thời giản bảo hành (ngày): ");
                thoiGianBaoHanh = Integer.parseInt(SCANNER.nextLine());
                if(thoiGianBaoHanh<=0||thoiGianBaoHanh>730){
                    throw new SoDuongExecption("giá phải lớn hơn không và bé hơn 730 ngày(2 năm)");
                }
                break;
            }catch (SoDuongExecption e) {
                System.out.println(e.getMessage());
            }
        }


        String phamViBaoHanh = setPhamViBaoHanh();

        dienthoaiList.add(new DienThoaiChinhHang(ma, tenDienthoai, gia, soLuong, nhaSanXuat, thoiGianBaoHanh, phamViBaoHanh));
        ReadWriteDienThoai.writeDienThoaiFile(PATH, dienthoaiList);
        System.out.println("nhập thành công");

    }

    public String setPhamViBaoHanh() {
        do {
            System.out.println("PHẠM VI BẢ HÀNH\n" +
                    "1. Quốc tê\n" +
                    "2. Toàn quốc");
            int bienChon = 0;
            try {
                bienChon = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
            switch (bienChon) {
                case 1:
                    return "Quốc tế";
                case 2:
                    return "Toàn quốc";
                default:
                    System.out.println("bạn nhập sai yêu cầu nhập lại");
            }
        } while (true);
    }

    @Override
    public void remove() {
        List<Dienthoai> dienthoaiList = ReadWriteDienThoai.readDienThoai(PATH);
        for (Dienthoai dienThoaiChinhHang : dienthoaiList) {
            System.out.println(dienThoaiChinhHang);
        }
        int ma;
        boolean flag = false;
        do {
            System.out.println("nhập vào mã điện thoại cần xóa:");
            ma = Integer.parseInt(SCANNER.nextLine());
            for (Dienthoai dienthoai : dienthoaiList) {
                if (dienthoai.getMa() == ma) {
                    System.out.println("bạn có chắc chắn muốn xóa hay không:\n" +
                            "1. Có\n" +
                            "2. Không");
                    int bienSoSanh = Integer.parseInt(SCANNER.nextLine());
                    if (bienSoSanh == 1) {
                        dienthoaiList.remove(dienthoai);
                        ReadWriteDienThoai.writeDienThoaiFile(PATH, dienthoaiList);
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
    public void display() {
        List<Dienthoai> dienthoaiList = ReadWriteDienThoai.readDienThoai(PATH);
        for (Dienthoai dienThoaiChinhHang : dienthoaiList) {
            System.out.println(dienThoaiChinhHang);
        }

    }

    @Override
    public void find() {
        List<Dienthoai>dienthoaiList=ReadWriteDienThoai.readDienThoai(PATH);
        int bienChon;
        boolean bienCo=false;
        do {
            System.out.println("nhập vào số cần tìm kiếm \n" +
                    "1.Theo mã \n" +
                    "2. Theo tên điện thoại");
            bienChon = Integer.parseInt(SCANNER.nextLine());
            if (bienChon != 1 && bienChon != 2) {
                System.out.println("yêu cầu nhập lại:");
            }

        } while (bienChon != 1 && bienChon != 2);

        if (bienChon == 1) {
            System.out.println("nhập vào id cần tìm kiếm:");
            int maTimKiem = Integer.parseInt(SCANNER.nextLine());
            for (Dienthoai dienthoai : dienthoaiList) {
                if (dienthoai.getMa() == maTimKiem) {
                    System.out.println(dienthoai);
                    bienCo = true;
                    break;
                }
            }
        } else {
            System.out.println("nhập vào tên cần tìm kiếm: ");
            String tenTimKiem = SCANNER.nextLine();
            for (Dienthoai dienthoai : dienthoaiList) {
                if (dienthoai.getTenDienthoai().contains(tenTimKiem)) {
                    System.out.println(dienthoai);
                    bienCo = true;
                }
            }
        }
        if (!bienCo) {
            System.out.println("không tìm thấy");
        }
    }
}
