package ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.impl;

import ss9_DSA_DanhSach.exercise.CarMVC.mvc.model.XeTai;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.IXeTaiService;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.utils.ReadFileUtil;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.utils.WriteFileUtil;


import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class XeTaiService implements IXeTaiService {
    private static final String PATH="src/ss9_DSA_DanhSach/exercise/CarMVC/mvc/data/xetai.csv";
   // private static List<XeTai> xeTaiList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    @Override
    public void addXeTai() throws IOException {
        List<XeTai> xeTaiList= ReadFileUtil.readXeTaiFile(PATH);
        XeTai xeTai = thongTinXeTai();
        xeTaiList.add(xeTai);
        System.out.println("thêm mới thành công:");
        WriteFileUtil.writeXeTaiFile(PATH,xeTaiList);
    }

    @Override
    public void displayXeTai() throws IOException {
        List<XeTai> xeTaiList= ReadFileUtil.readXeTaiFile(PATH);
        for (XeTai xeTai : xeTaiList) {
            System.out.println(xeTai);
        }
    }

    @Override
    public void removeXeTai() throws IOException {
        List<XeTai> xeTaiList= ReadFileUtil.readXeTaiFile(PATH);
        System.out.println("nhập vào biển kiểm soát cần xóa: ");
        int idRemove = Integer.parseInt(sc.nextLine());
        boolean kiemTra = false;
        for (XeTai xeTai : xeTaiList) {
            if (xeTai.getBienXe() == idRemove) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int kiemTraCoKhong = Integer.parseInt(sc.nextLine());
                if (kiemTraCoKhong == 1) {
                    xeTaiList.remove(xeTai);
                    WriteFileUtil.writeXeTaiFile(PATH,xeTaiList);
                    System.out.println("Xóa thành công!.");
                }
                kiemTra = true;
                break;

            }
        }
        if (!kiemTra) {
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void timXeTai() throws IOException {
        List<XeTai> xeTaiList= ReadFileUtil.readXeTaiFile(PATH);
        System.out.println("Mời bạn nhập biển kiểm soát cần tìm: ");
        int xeTimKiem = Integer.parseInt(sc.nextLine());
        boolean bienTam = false;

        for (XeTai xeTai : xeTaiList) {
            if (xeTimKiem == xeTai.getBienXe()) {
                System.out.println(xeTai);
                bienTam = true;
                break;
            }
        }

        if (!bienTam) {
            System.out.println("Không tìm thấy!");
        }
    }

    /**
     * phương thức cho người dùng nhập vào thông tin xe tải
     *
     * @return
     */
    public static XeTai thongTinXeTai() {
        System.out.print("nhập vào biên kiểm soát: ");
        int bienXe = Integer.parseInt(sc.nextLine());
        System.out.print("nhập vào hảng sản xuất: ");
        String tenCongTy = sc.nextLine();
        System.out.print("nhập vào năm sản xuất: ");
        int namSanXuat = Integer.parseInt(sc.nextLine());
        System.out.print("nhập vào chủ sở hữu: ");
        String tenChu = sc.nextLine();
        System.out.print("nhập vào tải trọng: ");
        double trongTai = Double.parseDouble(sc.nextLine());
        XeTai xeTai = new XeTai(tenChu, tenCongTy, namSanXuat, bienXe, trongTai);
        return xeTai;
    }
}
