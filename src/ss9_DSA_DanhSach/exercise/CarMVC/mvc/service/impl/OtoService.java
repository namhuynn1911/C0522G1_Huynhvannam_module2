package ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.impl;

import ss9_DSA_DanhSach.exercise.CarMVC.mvc.model.Oto;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.model.XeTai;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.IOtoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OtoService implements IOtoService {
    private static List<Oto> otoList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    @Override
    public void addOto() {
        Oto oto = thongTinOto();
        otoList.add(oto);
        System.out.println("thêm mới thành công");
    }

    public static Oto thongTinOto() {
        System.out.print("nhập vào biên kiểm soát: ");
        String bienXe = sc.nextLine();
        System.out.print("nhập vào hảng sản xuất: ");
        String tenCongTy = sc.nextLine();
        System.out.print("nhập vào năm sản xuất: ");
        int namSanXuat = Integer.parseInt(sc.nextLine());
        System.out.print("nhập vào chủ sở hữu: ");
        String tenChu = sc.nextLine();
        System.out.print("nhập vào số chổ ngồi: ");
        int soCho = Integer.parseInt(sc.nextLine());
        System.out.println("nhập vào kiểu xe");
        String kieuXe = sc.nextLine();
        Oto oto = new Oto(bienXe, tenCongTy, namSanXuat, tenChu, soCho, kieuXe);
        return oto;
    }
}
