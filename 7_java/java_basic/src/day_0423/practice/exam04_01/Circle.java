package day_0423.practice.exam04_01;

public class Circle extends Shape{
    private double radius;

    Circle() {
        super("원");
    }

    double getRadius() {
        return radius;
    }
    void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    void calculationArea() {
        setArea(getRadius() * getRadius() * Math.PI);
    }
}
