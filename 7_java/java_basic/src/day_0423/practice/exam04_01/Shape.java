package day_0423.practice.exam04_01;

public abstract class Shape {
    private double area;
    private String name;

    Shape() {}
    Shape(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    double getArea() {
        return area;
    }

    void setName(String name) {
        this.name = name;
    }

    void setArea(double area) {
        this.area = area;
    }
    abstract void calculationArea();
    void print() {
        System.out.println(getName()+"의 면적은 " + getArea());
    }
}