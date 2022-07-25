package ss9_DSA_DanhSach.exercise.CarMVC.mvc.model;

public class XeTai extends Xe {
    private double trongTai;

    public XeTai() {
    }

    public XeTai(String tenChu, String tenCongTy, int namSanXuat, int bienXe, double trongTai) {
        super(tenChu, tenCongTy, namSanXuat, bienXe);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s \n",this.getTenChu(),this.getTenCongTy(),this.getNamSanXuat(),this.getBienXe(),
                this.getTrongTai());
    }

    @Override
    public String toString() {
        return super.toString() + " XeTa" +
                "trongTai=" + trongTai;
    }
}
