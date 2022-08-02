package ss17_binary_file.lamthem.mvc_phone.model;

public class DienThoaiChinhHang extends Dienthoai{
    private int thoiGianBaoHanh;
    private String phamViBaoHanh;

    public DienThoaiChinhHang() {
    }

    public DienThoaiChinhHang(int ma, String tenDienthoai, int gia, int soLuong, String nhaSanXuat,
                              int thoiGianBaoHanh, String phamViBaoHanh) {
        super(ma, tenDienthoai, gia, soLuong, nhaSanXuat);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getPhamViBaoHanh() {
        return phamViBaoHanh;
    }

    public void setPhamViBaoHanh(String phamViBaoHanh) {
        this.phamViBaoHanh = phamViBaoHanh;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s\n",this.getMa(),this.getTenDienthoai(),this.getGia(),
                this.getSoLuong(),this.getNhaSanXuat(),this.getThoiGianBaoHanh(),this.getPhamViBaoHanh());
    }

    @Override
    public String toString() {
        return super.toString()+
                " thoiGianBaoHanh='" + thoiGianBaoHanh + '\'' +
                ", phamViBaoHanh='" + phamViBaoHanh;
    }
}
