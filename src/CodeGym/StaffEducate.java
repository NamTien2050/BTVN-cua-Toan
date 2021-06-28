package CodeGym;

import java.sql.Time;

public class StaffEducate extends Staff {
    private String educationIndustry;

    public StaffEducate(FullTime fullTime) {
    }
    public StaffEducate(PartTime partTime){}

    public StaffEducate(String name, double age, String sex, String numPhone, String email, double salary, String educationIndustry) {
        super(name, age, sex, numPhone, email, salary);
        this.educationIndustry = educationIndustry;
    }

    public String getEducationIndustry() {
        return educationIndustry;
    }

    public void setEducationIndustry(String educationIndustry) {
        this.educationIndustry = educationIndustry;
    }

    @Override
    public String toString() {
        return "StaffEducate{" +
                super.toString() +
                "educationIndustry='" + educationIndustry + '\'' +
                '}';
    }
}

