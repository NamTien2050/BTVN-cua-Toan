package CodeGym;

public class Staff {
    private String name, sex, numPhone, email;
    private double age, salary;

    public Staff() {
    }

    public Staff(String name, double age, String sex, String numPhone, String email, double salary) {
        this.name = name;
        this.sex = sex;
        this.numPhone = numPhone;
        this.email = email;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNumPhone() {
        return numPhone;
    }

    public void setNumPhone(String numPhone) {
        this.numPhone = numPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", numPhone='" + numPhone + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }
}
