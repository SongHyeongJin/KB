package day_0423.study.member;

public class Member {
    private String name;
    private int age;
    private String call;
    private String email;
    private String address;
    private double killo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getKillo() {
        return killo;
    }

    public void setKillo(double killo) {
        this.killo = killo;
    }

    public Member(String name, int age, String call, String email, String address, double killo) {
        this.name = name;
        this.age = age;
        this.call = call;
        this.email = email;
        this.address = address;
        this.killo = killo;
    }
}
