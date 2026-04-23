package day_0423.practice.exam04_02;

public abstract class Shape {

    private double area;
    private String name;

    // 생성자
    public Shape(String name) {
        this.name = name;
    }

    // 면적 계산하는 추상 메소드
    abstract void calculationArea();

    // 출력 메소드
    public void print() {
        System.out.println(this.name + "의 면적은 " + this.area);
    };

    // area getter
    public double getArea() {
        return area;
    }

    // area setter
    public void setArea(double area) {
        this.area = area;
    }

    // name getter

    public String getName() {
        return name;
    }

    // name setter
    public void setName(String name) {
        this.name = name;
    }
}