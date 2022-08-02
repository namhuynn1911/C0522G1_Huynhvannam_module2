package ss17_binary_file.lamthem.mvc_phone.model;

public abstract class Dienthoai {
    private int ma;
    private String tenDienthoai;
    private int gia;
    private int soLuong;
    private String nhaSanXuat;

    public Dienthoai() {
    }

    public Dienthoai(int ma, String tenDienthoai, int gia, int soLuong, String nhaSanXuat) {
        this.ma = ma;
        this.tenDienthoai = tenDienthoai;
        this.gia = gia;
        this.soLuong = soLuong;
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTenDienthoai() {
        return tenDienthoai;
    }

    public void setTenDienthoai(String tenDienthoai) {
        this.tenDienthoai = tenDienthoai;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }
    public abstract String getInfo();

    @Override
    public String toString() {
        return "Dienthoai" +
                "ma=" + ma +
                ", tenDienthoai='" + tenDienthoai + '\'' +
                ", gia=" + gia +
                ", soLuong=" + soLuong +
                ", nhaSanXuat='" + nhaSanXuat;
    }
}
