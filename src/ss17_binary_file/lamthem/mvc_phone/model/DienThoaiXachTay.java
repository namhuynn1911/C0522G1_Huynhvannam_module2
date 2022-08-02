package ss17_binary_file.lamthem.mvc_phone.model;

public class DienThoaiXachTay extends Dienthoai{
    private String quocGiaXachTay;
    private String trangThai;

    public DienThoaiXachTay() {
    }

    public DienThoaiXachTay(int ma, String tenDienthoai, int gia, int soLuong,
                            String nhaSanXuat, String quocGiaXachTay, String trangThai) {
        super(ma, tenDienthoai, gia, soLuong, nhaSanXuat);
        this.quocGiaXachTay = quocGiaXachTay;
        this.trangThai = trangThai;
    }

    public String getQuocGiaXachTay() {
        return quocGiaXachTay;
    }

    public void setQuocGiaXachTay(String quocGiaXachTay) {
        this.quocGiaXachTay = quocGiaXachTay;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s\n",this.getMa(),this.getTenDienthoai(),this.getGia(),
                this.getSoLuong(),this.getNhaSanXuat(),this.getQuocGiaXachTay(),this.getTrangThai());
    }

    @Override
    public String toString() {
        return super.toString() +
                " quocGiaXachTay='" + quocGiaXachTay + '\'' +
                ", trangThai='" + trangThai;
    }
}
