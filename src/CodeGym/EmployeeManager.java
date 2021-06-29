package CodeGym;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager {
    ArrayList<Staff> arr = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public EmployeeManager() {
        lishStaff();
    }

    public void lishStaff() {
        arr.add(new FullTime("Dũng", 18, "nam", "0968 424 528", "dung@gmail.com", 12.000, "java"));
        arr.add(new PartTime("Toàn", 24, "nam", "0968 424 528", "dung@gmail.com", 12.000, "java", 101));
        arr.add(new RecruitmentStaff("Lãm", 31, "nam", "0968 424 528", "dung@gmail.com", 12.000, 19));
        arr.add(new FullTime("Ly", 17, "nữ", "0968 424 528", "dung@gmail.com", 12.000, "java"));
        arr.add(new PartTime("Thuý", 25, "nữ", "0968 424 528", "dung@gmail.com", 12.000, "java", 91));
        arr.add(new RecruitmentStaff("Kỳ", 27, "nam", "0968 424 528", "dung@gmail.com", 12.000, 19));
        arr.add(new FullTime("Tám", 21, "nam", "0968 424 528", "dung@gmail.com", 12.000, "java"));
        arr.add(new PartTime("Ngọc Anh", 29, "nam", "0968 424 528", "dung@gmail.com", 12.000, "java", 93));
        arr.add(new RecruitmentStaff("Phương Anh", 20, "nữ", "0968 424 528", "dung@gmail.com", 12.000, 19));
    }

    public Staff addStaff(String dataType) {
        System.out.print("Nhập tên ");
        String name = sc.nextLine();
        System.out.print("Nhập tuổi ");
        double age = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập giới tính ");
        String sex = sc.nextLine();
        System.out.print("Nhập sđt ");
        String phoneNumber = sc.nextLine();
        System.out.print("Nhập Email ");
        String email = sc.nextLine();
        System.out.print("Nhập lương ");
        double salary = Double.parseDouble(sc.nextLine());
        if (dataType.equals("1")) {
            System.out.print("Nhập ngành đào tạo ");
            String educationIndustry = sc.nextLine();
            System.out.print("Kiểu nhân viên đào tạo ");
            String typeEducationalStaff = sc.nextLine();
            if (typeEducationalStaff.equals("a")) {
                return new StaffEducate(name, age, sex, phoneNumber, email, salary, educationIndustry);
            } else if (typeEducationalStaff.equals("b")) {
                System.out.print("Số giờ làm việc ");
                double hours = Double.parseDouble(sc.nextLine());
                return new PartTime(name, age, sex, phoneNumber, email, salary, educationIndustry, hours);
            }
        } else if (dataType.equals("2")) {
            System.out.print("Doanh số (học viên) ");
            int numberRecruitments = sc.nextInt();
            return new RecruitmentStaff(name, age, sex, phoneNumber, email, salary, numberRecruitments);
        }
        return addStaff(dataType);
    }

    public Staff searchName() {
        String name = sc.nextLine();
        for (Staff search : arr) {
            if (search.getName().equals(name)) {
                return search;
            }
        }
        System.out.print("nhập sai, nhập lại: ");
        return searchName();
    }

    public void removeStaff() {
        System.out.println("chọn nhân viên để xóa");
        System.out.println("a.NV đào tạo" + "\n" + "b.NV tuyển sinh");
        String choose = sc.nextLine();
        if (choose.equals("a")) {
            System.out.print("nhập tên cần xóa: ");
            StaffEducate staffEducate = (StaffEducate) searchName();
            arr.remove(staffEducate);
        } else if (choose.equals("b")) {
            System.out.print("Nhập tên cần xóa: ");
            RecruitmentStaff recruitmentStaff = (RecruitmentStaff) searchName();
            arr.remove(recruitmentStaff);
        }
        disPlay();
    }

    public void salaryDisplay() {
        System.out.print("Nhập tên");
        System.out.print(searchName().getSalary());
    }

    public void disPlayName() {
        System.out.print("Nhập tên");
        System.out.println(searchName());
    }

    public void sortStaff() {
        SortStaff sortStaff = new SortStaff();
        arr.sort(sortStaff);
    }

    public void disPlay() {
        for (Staff lish : arr
        ) {
            System.out.println(lish);
        }
    }
}
