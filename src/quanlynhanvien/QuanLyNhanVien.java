package quanlynhanvien;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyNhanVien {
    Scanner sc = new Scanner(System.in);
    ArrayList<NhanVien> arr = new ArrayList<>();
    NhanVien nv = new NhanVien();

    public QuanLyNhanVien() {
        lishNhanVien();
    }

    public void lishNhanVien() {
        arr.add(new NvFullTime("Hung", 14, "Nam", 0988.729473, 24000.000));
        arr.add(new NvPartTime("Dung", 29, "nam", 0977.234853, 12.000, 79));
        arr.add(new NvFullTime("Lam", 17, "Nam", 0988.729473, 24000.000));
        arr.add(new NvPartTime("Tam", 24, "nam", 0977.234853, 12.000, 79));
    }

    public NhanVien addNV() {
        System.out.print("Nhap ten nv");
        String ten = sc.nextLine();
        System.out.print("Nhap tuoi");
        int tuoi = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap gioi tinh");
        String gioiTinh = sc.nextLine();
        System.out.print("Nhap sđt");
        double sdt = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap luong");
        double luong = Double.parseDouble(sc.nextLine());
        return new NhanVien(ten, tuoi, gioiTinh, sdt, luong);
    }

    public void addNVFullTime() {
        arr.add(addNV());
    }

    public void addNVPartTime() {
        System.out.print("Nhap ten nv");
        String ten = sc.nextLine();
        System.out.print("Nhap tuoi");
        int tuoi = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap gioi tinh");
        String gioiTinh = sc.nextLine();
        System.out.print("Nhap sđt");
        double sdt = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap luong");
        double luong = Double.parseDouble(sc.nextLine());
        System.out.print("so gio lam viec:");
        int gio = sc.nextInt();
        arr.add(new NvPartTime(ten, tuoi, gioiTinh, sdt, luong, gio));
    }

    public void xoaNV() {
        String timTen=sc.nextLine();
        for (NhanVien tim : arr
        ) {
            if (tim.getTen().equals(timTen)){
                arr.remove(tim);
            }
        }
    }
    public void xapXepTheoTuoi(){
        SortNhanVien nhanVien= new SortNhanVien();
        arr.sort(nhanVien);
//      arr.sort(new Comparator<NhanVien>() {
//          @Override
//          public int compare(NhanVien o1, NhanVien o2) {
//              return o1.getTuoi()-o2.getTuoi();
//          }
//      });
    }
}
