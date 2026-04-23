package day_0423.practice.exam04_02;

public class Rectangular extends Shape {

    private double width;
    private double height;

    // 생성자
    public Rectangular(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    // Shape 클래스의 추상 메소드 구현
    @Override
    void calculationArea() {
        setArea(width * height);
    }
}
