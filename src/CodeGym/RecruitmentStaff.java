package CodeGym;

public class RecruitmentStaff extends Staff {
    private int numberRecruitments;

    public RecruitmentStaff() {
    }

    public RecruitmentStaff(String name, double age, String sex, String numPhone, String email, double salary, int numberRecruitments) {
        super(name, age, sex, numPhone, email, salary);
        this.numberRecruitments = numberRecruitments;
    }

    public int getNumberRecruitments() {
        return numberRecruitments;
    }

    public void setNumberRecruitments(int numberRecruitments) {
        this.numberRecruitments = numberRecruitments;
    }

    @Override
    public String toString() {
        return "RecruitmentStaff{" +
                super.toString() +
                "numberRecruitments=" + numberRecruitments +
                '}';
    }
}
