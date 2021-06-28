package employeemanager;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {
    Scanner scanner = new Scanner(System.in);
    Cadres cadres = new Cadres();

    ArrayList<Cadres> arr = new ArrayList<>();

    public EmployeeManagement() {
    }

    public void addWorker() {
        Worker worker = new Worker();
        System.out.print("nhập Id: ");
        worker.setId(Integer.parseInt(scanner.nextLine()));
        System.out.print("Nhập tên: ");
        worker.setName(scanner.nextLine());
        System.out.print("Năm sinh: ");
        worker.setYearOfBirth(scanner.nextLine());
        System.out.print("Giới tính: ");
        worker.setSex(scanner.nextLine());
        System.out.print("Địa chỉ: ");
        worker.setAddress(scanner.nextLine());
        System.out.print("Bậc: ");
        worker.setLever(scanner.nextLine());
        System.out.print("Ngành: ");
        worker.setBranch(scanner.nextLine());
        arr.add(worker);
    }

    public void addEngineer() {
        Engineer engineer = new Engineer();
        System.out.print("nhập Id: ");
        engineer.setId(Integer.parseInt(scanner.nextLine()));
        System.out.print("Nhập tên: ");
        engineer.setName(scanner.nextLine());
        System.out.print("Năm sinh: ");
        engineer.setYearOfBirth(scanner.nextLine());
        System.out.print("Giới tính: ");
        engineer.setSex(scanner.nextLine());
        System.out.print("Địa chỉ: ");
        engineer.setAddress(scanner.nextLine());
        System.out.print("Ngành: ");
        engineer.setBranch(scanner.nextLine());
        arr.add(engineer);
    }

    public int searchName() {
        System.out.print("Nhập tên CBNV");
        String intput = scanner.nextLine();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getName().equals(intput)) {
                return i;
            }
        }
        return -1;
    }
}
