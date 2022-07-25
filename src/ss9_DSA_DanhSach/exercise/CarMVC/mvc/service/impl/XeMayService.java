package ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.impl;

import ss9_DSA_DanhSach.exercise.CarMVC.mvc.model.XeMay;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.IXeMayService;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.utils.ReadFileUtil;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.utils.WriteFileUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeMayService implements IXeMayService {
    private static final String PATH="src/ss9_DSA_DanhSach/exercise/CarMVC/mvc/data/xemay.csv";
    private static List<XeMay> xeMayList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public void writeXeMay() throws IOException {
        WriteFileUtil.writeXeMayFile(PATH,xeMayList);
    }
    public void readXeMay() throws IOException {
        List<XeMay> list = ReadFileUtil.readXeMayFile(PATH);
        xeMayList.clear();
        xeMayList.addAll(list);
    }

    @Override
    public void addXeMay() throws IOException {
       readXeMay();
        XeMay xeMay = thongTinXeMay();
        xeMayList.add(xeMay);
        System.out.println("thêm mới xe máy thành công");
        writeXeMay();
    }

    @Override
    public void displayXeMay() throws IOException {
        readXeMay();
        for (XeMay xeMay : xeMayList) {
            System.out.println(xeMay);
        }
    }

    @Override
    public void removeXeMay() throws IOException {
        readXeMay();
        System.out.println("nhập vào biển kiểm soát cần xóa: ");
        int idRemove = Integer.parseInt(sc.nextLine());
        boolean kiemTra = false;
        for (XeMay xeMay : xeMayList) {
            if (xeMay.getBienXe() == idRemove) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int kiemTraCoKhong = Integer.parseInt(sc.nextLine());
                if (kiemTraCoKhong == 1) {
                    xeMayList.remove(xeMay);
                    writeXeMay();
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
    public void timXeNay() throws IOException {
        readXeMay();
        System.out.println("Mời bạn nhập biển kiểm soát cần tìm: ");
        int xeTimKiem = Integer.parseInt(sc.nextLine());
        boolean bienTam = false;

        for (XeMay xeMay : xeMayList) {
            if (xeTimKiem == xeMay.getBienXe()) {
                System.out.println(xeMay);
                bienTam = true;
                break;
            }
        }

        if (!bienTam) {
            System.out.println("Không tìm thấy!");
        }
    }

    /**
     * phương thức cho người dùng nhập thông tin xe máy
     *
     * @return
     */
    public static XeMay thongTinXeMay() {
        System.out.print("nhập vào biên kiểm soát: ");
        int bienXe = Integer.parseInt(sc.nextLine());
        System.out.print("nhập vào hảng sản xuất: ");
        String tenCongTy = sc.nextLine();
        System.out.print("nhập vào năm sản xuất: ");
        int namSanXuat = Integer.parseInt(sc.nextLine());
        System.out.print("nhập vào chủ sở hữu: ");
        String tenChu = sc.nextLine();
        System.out.print("nhập vào công xuất: ");
        int congXuat = Integer.parseInt(sc.nextLine());
        XeMay xeMay = new XeMay(tenChu, tenCongTy, namSanXuat, bienXe, congXuat);
        return xeMay;
    }
}

