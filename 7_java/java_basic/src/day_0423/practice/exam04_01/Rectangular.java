package day_0423.practice.exam04_01;

public class Rectangular extends Shape{
    private double width;
    private double hight;

    Rectangular() {}

    double getWidth() {
        return width;
    }

    double getHight() {
        return hight;
    }

    void setWidth(double width) {
        this.width = width;
    }
    void setHight(double hight) {
        this.hight = hight;
    }

    @Override
    void calculationArea() {
        setArea(getWidth() * getHight());
    }
}
