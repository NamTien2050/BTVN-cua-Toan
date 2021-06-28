package CodeGym;

public class PartTime extends StaffEducate {
    private double hours;

    public PartTime() {
        super(new FullTime("dung", 18, "nam", "0968 424 528", "dung@gmail.com", 12.000, "java"));
    }

    public PartTime(double hours) {
        super(new FullTime("dung", 18, "nam", "0968 424 528", "dung@gmail.com", 12.000, "java"));
        this.hours = hours;
    }

    public PartTime(String name, double age, String sex, String numPhone, String email, double salary, String educationIndustry, double hours) {
        super(name, age, sex, numPhone, email, salary, educationIndustry);
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "PartTime{" +
                super.toString() +
                "hours=" + hours +
                '}';
    }
}
