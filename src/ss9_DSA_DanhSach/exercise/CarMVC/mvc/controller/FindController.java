package ss9_DSA_DanhSach.exercise.CarMVC.mvc.controller;

import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.IOtoService;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.IXeMayService;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.IXeTaiService;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.impl.OtoService;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.impl.XeMayService;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.impl.XeTaiService;

import java.io.IOException;
import java.util.Scanner;

public class FindController {
    public static void timKiem() throws IOException {
        Scanner sc = new Scanner(System.in);
        IXeTaiService iXeTaiService = new XeTaiService();
        IOtoService iOtoService = new OtoService();
        IXeMayService iXeMayService = new XeMayService();

        do {
            System.out.println("Tìm kiếm xe \n" +
                    "1. Tìm kiếm xe tải \n" +
                    "2. Tìm kiếm oto \n" +
                    "3. Tìm kiếm xe máy \n" +
                    "4. Quay lại chức năng chính");
            int bienSoSanh = Integer.parseInt(sc.nextLine());

            switch (bienSoSanh) {
                case 1:
                    iXeTaiService.timXeTai();
                    break;
                case 2:
                    iOtoService.timOto();
                    break;
                case 3:
                    iXeMayService.timXeNay();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
