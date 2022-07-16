package ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.impl;

import ss9_DSA_DanhSach.exercise.CarMVC.mvc.model.Oto;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.model.XeMay;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.IXeMayService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeMayService implements IXeMayService {
    private static List<XeMay> xeMayList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    @Override
    public void addXeMay() {
        XeMay xeMay = thongTinXeMay();
        xeMayList.add(xeMay);
        System.out.println("thêm mới xe máy thành công");
    }

    public static XeMay thongTinXeMay() {
        System.out.print("nhập vào biên kiểm soát: ");
        String bienXe = sc.nextLine();
        System.out.print("nhập vào hảng sản xuất: ");
        String tenCongTy = sc.nextLine();
        System.out.print("nhập vào năm sản xuất: ");
        int namSanXuat = Integer.parseInt(sc.nextLine());
        System.out.print("nhập vào chủ sở hữu: ");
        String tenChu = sc.nextLine();
        System.out.print("nhập vào công xuất: ");
        int congXuat = Integer.parseInt(sc.nextLine());
        XeMay xeMay = new XeMay(bienXe, tenCongTy, namSanXuat, tenChu, congXuat);
        return xeMay;
    }
}
