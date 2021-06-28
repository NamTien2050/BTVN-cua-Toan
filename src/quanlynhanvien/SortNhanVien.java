package quanlynhanvien;

import java.util.Comparator;

public class SortNhanVien implements Comparator<NhanVien> {
    @Override
    public int compare(NhanVien o1, NhanVien o2) {
        if(o1.getTuoi()>o2.getTuoi()){
            return 1;
        }
    return -1;
    }

}
