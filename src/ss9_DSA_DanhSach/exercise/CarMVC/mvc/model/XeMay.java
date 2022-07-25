package ss9_DSA_DanhSach.exercise.CarMVC.mvc.model;

public class XeMay extends Xe {
    private double congSuat;

    public XeMay() {
    }

    public XeMay(String tenChu, String tenCongTy, int namSanXuat, int bienXe, double congSuat) {
        super(tenChu, tenCongTy, namSanXuat, bienXe);
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s \n",this.getTenChu(),this.getTenCongTy(),this.getNamSanXuat(),
                this.getBienXe(),this.getCongSuat());
    }

    @Override
    public String toString() {
        return super.toString() + " XeMay" +
                "congSuat=" + congSuat;
    }
}
