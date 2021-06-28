package employeemanager;

public class Worker extends Cadres {
    private String lever, branch;

    public Worker() {
    }

    public Worker(String lever, String branch) {
        this.lever = lever;
        this.branch = branch;
    }

    public Worker(int id, String name, String yearOfBirth, String sex, String address, String lever, String branch) {
        super(id, name, yearOfBirth, sex, address);
        this.lever = lever;
        this.branch = branch;
    }

    public String getLever() {
        return lever;
    }

    public void setLever(String lever) {
        this.lever = lever;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Worker{" +
                super.toString()+
                "lever='" + lever + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
