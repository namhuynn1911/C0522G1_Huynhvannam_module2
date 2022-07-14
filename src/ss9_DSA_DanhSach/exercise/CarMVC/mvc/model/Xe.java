package ss9_DSA_DanhSach.exercise.CarMVC.mvc.model;

public class Xe {
    private String tenChu;
    private String tenCongTy;
    private int namSanXuat;
    private String bienXe;

    public Xe() {
    }

    public Xe(String tenChu, String tenCongTy, int namSanXuat, String bienXe) {
        this.tenChu = tenChu;
        this.tenCongTy = tenCongTy;
        this.namSanXuat = namSanXuat;
        this.bienXe = bienXe;
    }

    public String getTenChu() {
        return tenChu;
    }

    public void setTenChu(String tenChu) {
        this.tenChu = tenChu;
    }

    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getBienXe() {
        return bienXe;
    }

    public void setBienXe(String bienXe) {
        this.bienXe = bienXe;
    }

    @Override
    public String toString() {
        return "Xe" +
                "tenChu='" + tenChu + '\'' +
                ", tenCongTy='" + tenCongTy + '\'' +
                ", namSanXuat=" + namSanXuat +
                ", bienXe='" + bienXe + '\'';
    }
}
