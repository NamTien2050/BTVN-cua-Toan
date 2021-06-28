package employeemanager;

import java.util.Scanner;

public class MainCadres {
    public static void main(String[] args) {
        EmployeeManagement manager = new EmployeeManagement();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("=====Menu=====");
            System.out.println("Tùy chọn chức năng: " + "\n" + "0.Hiển thị danh sách" + "\n" + "1.Thêm thông tin " + "\n" + "2.Xắp xếp" + "\n" + "3.Tìm kiếm" + "\n" + "4.Sửa thông tin" + "\n" + "5.Xóa" + "6.Thoát");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("k. Kỹ sư" + "\n" + "c. Công nhân");
                    String choose2 = sc.nextLine();
                    switch (choose2) {
                        case "k":
                            manager.addEngineer();
                            break;
                        case "c":
                            manager.addWorker();
                            break;
                    }
            }
        }
    }
}
