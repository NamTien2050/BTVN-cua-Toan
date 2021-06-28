package quanlynhanvien;

public class NvFullTime extends NhanVien {

    public NvFullTime() {
    }

    public NvFullTime(String ten, int tuoi, String gioiTinh, double sdt, double luong) {
        super(ten, tuoi, gioiTinh, sdt, luong);
    }

    @Override
    public String toString() {
        return "NvFullTime{" +
                super.toString() +
                '}';
    }
}
