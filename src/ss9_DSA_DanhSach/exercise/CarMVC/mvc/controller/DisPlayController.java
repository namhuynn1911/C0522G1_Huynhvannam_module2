package ss9_DSA_DanhSach.exercise.CarMVC.mvc.controller;

import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.IOtoService;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.IXeMayService;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.IXeTaiService;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.impl.OtoService;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.impl.XeMayService;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.impl.XeTaiService;

import java.util.Scanner;

public class DisPlayController {

    public static void hienThi() {
        Scanner sc = new Scanner(System.in);

        IOtoService iOtoService = new OtoService();
        IXeTaiService iXeTaiService = new XeTaiService();
        IXeMayService iXeMayService = new XeMayService();
        do {
            System.out.println("HIỂN THỊ DANH SÁCH XE \n" +
                    "1. Hiển thị xe tải \n" +
                    "2. Hiển thị xe ôto \n" +
                    "3. Hiển thị xe máy \n" +
                    "4. Quay lại chức năng chính");
            int bienSoSanh = Integer.parseInt(sc.nextLine());

            switch (bienSoSanh) {
                case 1:
                    iXeTaiService.displayXeTai();
                    break;
                case 2:
                    iOtoService.displayXeOto();
                    break;
                case 3:
                    iXeMayService.displayXeMay();
                    break;
                case 4:
                    return;
            }
        } while (true);


    }
}
