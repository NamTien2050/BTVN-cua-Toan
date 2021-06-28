package CodeGym;

public class FullTime extends StaffEducate{
    public FullTime() {
        super(new FullTime("dung", 18, "nam", "0968 424 528", "dung@gmail.com", 12.000, "java"));
    }

    public FullTime(String name, double age, String sex, String numPhone, String email, double salary, String educationIndustry) {
        super(name, age, sex, numPhone, email, salary, educationIndustry);
    }
}
