package ss9_DSA_DanhSach.exercise.CarMVC.mvc.controller;

import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.IOtoService;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.IXeMayService;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.IXeTaiService;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.impl.OtoService;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.impl.XeMayService;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.impl.XeTaiService;

import java.util.Scanner;

public class RemoveController {
    public static void xoaXe() {
        Scanner sc = new Scanner(System.in);
        IXeMayService iXeMayService = new XeMayService();
        IXeTaiService iXeTaiService = new XeTaiService();
        IOtoService iOtoService = new OtoService();

        do {
            System.out.println("Xóa phương tiện: \n" +
                    "1. Xóa xe tải. \n" +
                    "2. Xóa ôtô. \n" +
                    "3. Xóa xe máy. \n" +
                    "4. Quay về menu chính.");
            int bienSoSanh = Integer.parseInt(sc.nextLine());
            switch (bienSoSanh) {
                case 1:
                    iXeTaiService.removeXeTai();
                    break;
                case 2:
                    iOtoService.removeOto();
                    break;
                case 3:
                    iXeMayService.removeXeMay();
                    break;
                case 4:
                    return;
            }

        } while (true);
    }
}
