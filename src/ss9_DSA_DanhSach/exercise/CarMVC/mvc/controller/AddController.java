package ss9_DSA_DanhSach.exercise.CarMVC.mvc.controller;

import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.IOtoService;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.IXeMayService;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.IXeTaiService;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.impl.OtoService;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.impl.XeMayService;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.impl.XeTaiService;

import java.io.IOException;
import java.util.Scanner;

public class AddController {


    public static void themXe() throws IOException {
        Scanner sc = new Scanner(System.in);
        IOtoService iOtoService = new OtoService();
        IXeTaiService iXeTaiService = new XeTaiService();
        IXeMayService iXeMayService = new XeMayService();
        do {
            System.out.println("Thêm xe vào danh sách \n" +
                    "1.Thêm xe tải \n" +
                    "2. Thêm xe oto \n" +
                    "3. Thêm xe máy \n" +
                    "4. Quay lại chức năng chính");
            int bienSoSanh = Integer.parseInt(sc.nextLine());
            switch (bienSoSanh) {
                case 1:
                    iXeTaiService.addXeTai();
                    break;
                case 2:
                    iOtoService.addOto();
                    break;
                case 3:
                    iXeMayService.addXeMay();
                    break;
                case 4:
                    return;
            }

        } while (true);
    }
}
