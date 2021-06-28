package quanlynhanvien;

public class NvPartTime extends NhanVien {
    private int soGio;

    public NvPartTime() {
    }

    public NvPartTime(int soGio) {
        this.soGio = soGio;
    }

    public NvPartTime(String ten, int tuoi, String gioiTinh, double sdt, double luong, int soGio) {
        super(ten, tuoi, gioiTinh, sdt, luong);
        this.soGio = soGio;
    }

    public int getSoGio() {
        return soGio;
    }

    public void setSoGio(int soGio) {
        this.soGio = soGio;
    }

    @Override
    public String toString() {
        return "NvPartTime{" +
                super.toString() +
                "soGio=" + soGio +
                '}';
    }
}
