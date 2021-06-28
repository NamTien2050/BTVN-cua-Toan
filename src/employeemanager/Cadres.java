package employeemanager;

import java.sql.Time;

public class Cadres {
    private int id;
    private String name, yearOfBirth, sex, address;

    public Cadres() {
    }

    public Cadres(int id, String name, String yearOfBirth, String sex, String address) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.sex = sex;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Cadres{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearOfBirth='" + yearOfBirth + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
