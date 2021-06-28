package quanlytiendien;

public class Customer {
    private int maHK, soLuong;
    private String hoTen, ngayRaHoaDon;
    private double donGia;

    public Customer() {
    }

    public Customer(int maHK, String hoTen, String ngayRaHoaDon, int soLuong, double donGia) {
        this.maHK = maHK;
        this.soLuong = soLuong;
        this.hoTen = hoTen;
        this.ngayRaHoaDon = ngayRaHoaDon;
        this.donGia = donGia;
    }

    public int getMaHK() {
        return maHK;
    }

    public void setMaHK(int maHK) {
        this.maHK = maHK;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgayRaHoaDon() {
        return ngayRaHoaDon;
    }

    public void setNgayRaHoaDon(String ngayRaHoaDon) {
        this.ngayRaHoaDon = ngayRaHoaDon;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "maHK=" + maHK +
                ", hoTen='" + hoTen + '\'' +
                ", ngayRaHoaDon='" + ngayRaHoaDon + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                '}';
    }
}
