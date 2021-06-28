package quanlytiendien;

public class KHVietNam extends Customer {
    final int DINHMUC = 50;

    public KHVietNam() {
    }

    public KHVietNam(int maHK, String hoTen, String ngayRaHoaDon, int soLuong, double donGia) {
        super(maHK, hoTen, ngayRaHoaDon, soLuong, donGia);
    }

    public int getDINHMUC() {
        return DINHMUC;
    }

    @Override
    public String toString() {
        return "KHVietNam{" +
                super.toString() +
                "DINHMUC=" + DINHMUC +
                '}';
    }
}
