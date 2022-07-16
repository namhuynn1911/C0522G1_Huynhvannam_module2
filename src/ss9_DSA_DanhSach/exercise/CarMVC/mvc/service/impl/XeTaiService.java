package ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.impl;

import ss9_DSA_DanhSach.exercise.CarMVC.mvc.model.XeTai;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.IXeTaiService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeTaiService implements IXeTaiService {
    private static List<XeTai> xeTaiList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    @Override
    public void addXeTai() {
        XeTai xeTai = thongTinXeTai();
        xeTaiList.add(xeTai);
        System.out.println("thêm mới thành công:");
    }


    public static XeTai thongTinXeTai() {
        System.out.print("nhập vào biên kiểm soát: ");
        String bienXe = sc.nextLine();
        System.out.print("nhập vào hảng sản xuất: ");
        String tenCongTy = sc.nextLine();
        System.out.print("nhập vào năm sản xuất: ");
        int namSanXuat = Integer.parseInt(sc.nextLine());
        System.out.print("nhập vào chủ sở hữu: ");
        String tenChu = sc.nextLine();
        System.out.print("nhập vào tải trọng: ");
        double trongTai = Double.parseDouble(sc.nextLine());
        XeTai xeTai = new XeTai(bienXe, tenCongTy, namSanXuat, tenChu, trongTai);
        return xeTai;
    }
}
