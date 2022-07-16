package ss9_DSA_DanhSach.exercise.CarMVC.mvc.model;

public class XeMay extends Xe {
    private int congSuat;

    public XeMay() {
    }

    public XeMay(String tenChu, String tenCongTy, int namSanXuat, int bienXe, int congSuat) {
        super(tenChu, tenCongTy, namSanXuat, bienXe);
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return super.toString() + " XeMay" +
                "congSuat=" + congSuat;
    }
}
