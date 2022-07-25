package ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.impl;

import ss9_DSA_DanhSach.exercise.CarMVC.mvc.model.Oto;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.service.IOtoService;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.utils.ReadFileUtil;
import ss9_DSA_DanhSach.exercise.CarMVC.mvc.utils.WriteFileUtil;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class OtoService implements IOtoService {
    private static final String PATH="src/ss9_DSA_DanhSach/exercise/CarMVC/mvc/data/oto.csv";
   // private static List<Oto> otoList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);







    @Override
    public void addOto() throws IOException {
        List<Oto> otoList= ReadFileUtil.readOtoFile(PATH);
        Oto oto = thongTinOto();
        otoList.add(oto);
        System.out.println("thêm mới thành công");
        WriteFileUtil.writeOtoFile(PATH,otoList);
    }

    @Override
    public void displayXeOto() throws IOException {
        List<Oto> otoList= ReadFileUtil.readOtoFile(PATH);
        for (Oto oto : otoList) {
            System.out.println(oto);
        }
    }

    @Override
    public void removeOto() throws IOException {
        List<Oto> otoList= ReadFileUtil.readOtoFile(PATH);
        System.out.println("nhập vào biển số xe cần xóa: ");
        int idRemove = Integer.parseInt(sc.nextLine());
        boolean kiemTra = false;
        for (Oto oto : otoList) {
            if (oto.getBienXe() == idRemove) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int kiemTraCoKhong = Integer.parseInt(sc.nextLine());
                if (kiemTraCoKhong == 1) {
                    otoList.remove(oto);
                    WriteFileUtil.writeOtoFile(PATH,otoList);
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
    public void timOto() throws IOException {
        List<Oto> otoList= ReadFileUtil.readOtoFile(PATH);
        System.out.println("Mời bạn nhập biển kiểm soát cần tìm: ");
        int xeTimKiem = Integer.parseInt(sc.nextLine());
        boolean bienTam = false;

        for (Oto oto : otoList) {
            if (xeTimKiem == oto.getBienXe()) {
                System.out.println(oto);
                bienTam = true;
                break;
            }
        }

        if (!bienTam) {
            System.out.println("Không tìm thấy!");
        }
    }


    /**
     * phương thức cho người dùng nhập thông tin của Oto
     *
     * @return
     */
    public static Oto thongTinOto() {
        System.out.print("nhập vào biên kiểm soát: ");
        int bienXe = Integer.parseInt(sc.nextLine());
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
        Oto oto = new Oto(tenChu, tenCongTy, namSanXuat, bienXe, soCho, kieuXe);
        return oto;
    }
}
