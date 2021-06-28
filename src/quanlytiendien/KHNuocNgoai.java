package quanlytiendien;

public class KHNuocNgoai extends Customer {
    private String quocTich;

    public KHNuocNgoai() {
    }

    public KHNuocNgoai(String quocTich) {
        this.quocTich = quocTich;
    }

    public KHNuocNgoai(int maHK, String hoTen, String ngayRaHoaDon, int soLuong, double donGia, String quocTich) {
        super(maHK, hoTen, ngayRaHoaDon, soLuong, donGia);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public String toString() {
        return "KHNuocNgoai{" +
                super.toString() +
                "quocTich='" + quocTich + '\'' +
                '}';
    }
}
