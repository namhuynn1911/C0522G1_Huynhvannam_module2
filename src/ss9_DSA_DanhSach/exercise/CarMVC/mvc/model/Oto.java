package ss9_DSA_DanhSach.exercise.CarMVC.mvc.model;

public class Oto extends Xe {
    private int soCho;
    private String kieuXe;

    public Oto() {
    }

    public Oto(String tenChu, String tenCongTy, int namSanXuat, int bienXe, int soCho, String kieuXe) {
        super(tenChu, tenCongTy, namSanXuat, bienXe);
        this.soCho = soCho;
        this.kieuXe = kieuXe;
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s \n",this.getTenChu(),this.getTenCongTy(),this.getNamSanXuat(),
                this.getBienXe(),this.getSoCho(),this.getKieuXe());
    }

    @Override
    public String toString() {
        return super.toString() + "Oto" +
                "soCho=" + soCho +
                ", kieuXe='" + kieuXe + '\'';
    }
}
