package quanlytiendien;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyKH {
    Scanner sc = new Scanner(System.in);
    ArrayList<Customer> listKH = new ArrayList<>();
    KHVietNam vn = new KHVietNam();
    KHNuocNgoai nn = new KHNuocNgoai();

    public QuanLyKH() {
        listKhachHang();
    }

    public void listKhachHang() {
        listKH.add(new KHVietNam(14, "Nam", "14/10/2012", 51, 21.000));
        listKH.add(new KHNuocNgoai(17, "jone", "19/12/2011", 79, 30.000, "Mỹ"));
        listKH.add(new KHVietNam(19, "Linh", "14/10/2012", 51, 21.000));
        listKH.add(new KHNuocNgoai(7, "Ivan", "19/12/2011", 79, 30.000, "Nga"));
        listKH.add(new KHVietNam(4, "Hưng", "14/10/2012", 51, 21.000));
        listKH.add(new KHNuocNgoai(13, "Natasa", "19/12/2011", 79, 30.000, "Bỉ"));
        listKH.add(new KHVietNam(31, "Lãm", "14/10/2012", 51, 21.000));
        listKH.add(new KHNuocNgoai(47, "Ronado", "19/12/2011", 79, 30.000, "Đức"));
    }

    public void tinhHoaDonKHVN() {
        int num = sc.nextInt();
        double thanhTien;
        if (vn.getDINHMUC() <= num)
            thanhTien = vn.getSoLuong() * vn.getDonGia();
        else
            thanhTien = (vn.getSoLuong() * vn.getDonGia() * vn.getDINHMUC()) + ((vn.getSoLuong() - vn.getDINHMUC()) * vn.getDonGia() * 2.5);
    }

    public void tinhHoaDonKHNN() {
        double thanhTien = nn.getSoLuong() * nn.getDonGia();
    }

    public int timTheoMaKH(int num) {
        for (int i = 0; i < listKH.size(); i++) {
            if (listKH.get(i).getMaHK() == num) return i;
        }
        return timTheoMaKH(num);
    }

    public Customer timTheoTenKH() {
        String name = sc.nextLine();
        for (Customer C : listKH) {
            if (C.getHoTen().equals(name)) {
                return C;
            }
        }
        System.out.println("Nhập sai, mời nhập lại");
        return timTheoTenKH();
    }

    public void timkiemTenKH() {
        System.out.println("Nhâp tên KH cần tìm");
        System.out.println(timTheoTenKH());
    }


    public Customer addKH(int ma) {
        getCustomerId();
        System.out.print("Nhập mã Kh:");
        int maKH = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập họ tên:");
        String hoTen = sc.nextLine();
        System.out.print("Nhập ngày ra hóa đơn:");
        String nrhd = sc.nextLine();
        System.out.print("Nhập số lượng:");
        int soLuong = sc.nextInt();
        System.out.print("Nhập đơn giá:");
        double donGia = Double.parseDouble(sc.nextLine());
        return new Customer(maKH, hoTen, nrhd, soLuong, donGia);
    }

    public int getCustomerId() {
//        int index = 0;
//        do{
//            System.out.println("mã KH đã tồn tại. mời nhập lại:");
//            int intput= sc.nextInt();
//            index = timTheoMaKH(intput);
//        }while (index != -1);
//        return index;
        System.out.println("nhập id khách hàng:");
        int num2 = sc.nextInt();
        while (true) {
            if (timTheoMaKH(num2) != -1) {
                return timTheoMaKH(num2);
            }
        }
    }

    public void addKHVN(int vn) {
        listKH.add(addKH(vn));
    }

    public void addKHNN(int nn) {
        KHNuocNgoai nuocNgoai = new KHNuocNgoai();
        addKH(nn);
        System.out.print("Nhập quốc tịch");
        nuocNgoai.setQuocTich(sc.nextLine());
        listKH.add(addKH(nn));
        listKH.add(nuocNgoai);
    }

    public void editKH() {
    }

    public void disPlay() {
        for (Customer arr : listKH) {
            System.out.println(arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyKH quanLyKH = new QuanLyKH();
        quanLyKH.disPlay();
//        int id= sc.nextInt();
//        quanLyKH.addKHNN(id);
//        quanLyKH.timkiemTenKH();
    }
}
