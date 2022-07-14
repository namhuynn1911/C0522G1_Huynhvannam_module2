package ss9_DSA_DanhSach.exercise.CarMVC.mvc.controller;

import java.util.Scanner;

public class ThemController {
    private Scanner sc=new Scanner(System.in);

    public void themXe() {
        do{
            System.out.println("Thêm xe vào danh sách \n" +
                    "1.Thêm xe tải \n" +
                    "2. Thêm xe oto \n" +
                    "3. Thêm xe máy \n" +
                    "4. Quay lại chức năng chính");
            int bienSoSanh = Integer.parseInt(sc.nextLine());
            switch (bienSoSanh) {
                case 1:

                case 2:
                case 3:
                case 4:
                    return;
            }

        }while (true);
    }
}
