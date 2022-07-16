package ss9_DSA_DanhSach.exercise.CarMVC.mvc.controller;

import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.IOtoService;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.IXeMayService;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.IXeTaiService;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.impl.OtoService;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.impl.XeMayService;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.impl.XeTaiService;

import java.util.Scanner;

public class DisPlayController {
    private static Scanner sc = new Scanner(System.in);
    IOtoService iOtoService = new OtoService();
    IXeTaiService iXeTaiService = new XeTaiService();
    IXeMayService iXeMayService = new XeMayService();
    public static void hienThi() {
       do{
           System.out.println("HIỂN THỊ DANH SÁCH XE \n" +
                   "1. Hiển thị xe tải \n" +
                   "2. Hiển thị xe ôto \n" +
                   "3. Hiển thị xe máy \n" +
                   "4. Quay lại chức năng chính");
int bienSoSanh= Integer.parseInt(sc.nextLine());

       }while (true);
    }
}
