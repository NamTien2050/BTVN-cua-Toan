package employeemanager;

public class Engineer extends Cadres {
    private String branch;

    public Engineer() {
    }

    public Engineer(String branch) {
        this.branch = branch;
    }

    public Engineer(int id, String name, String yearOfBirth, String sex, String address, String branch) {
        super(id, name, yearOfBirth, sex, address);
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                super.toString() +
                "branch='" + branch + '\'' +
                '}';
    }
}
