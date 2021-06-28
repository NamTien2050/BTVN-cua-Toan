package CodeGym;

import java.util.Scanner;

public class MainStaff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeManager employeeManager = new EmployeeManager();
        while (true) {
            System.out.println("====Menu====");
            System.out.print("1.Thêm" + "\n" + "2.Xóa" + "\n" + "3.Hiển thị lương theo tên" + "\n" + "4.Tìm kiếm theo tên" + "\n" + "5.Xắp xếp" + "6.Show dang sách" + "\n" + "6.Thoát ");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    String dataType = sc.nextLine();
                    employeeManager.addStaff(dataType);
                    break;
                case 2:
                    employeeManager.removeStaff();
                    break;
                case 3:
                    employeeManager.salaryDisplay();
                    break;
                case 4:
                    employeeManager.disPlayName();
                    break;
                case 5:
                    employeeManager.sortStaff();
                    break;
                case 6:
                    employeeManager.disPlay();
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        }
    }
}
