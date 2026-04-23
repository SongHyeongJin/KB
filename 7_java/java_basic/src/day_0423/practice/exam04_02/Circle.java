package day_0423.practice.exam04_02;

public class Circle extends Shape {
    private double radius;

    // 생성자
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    // Shape 클래스의 추상 메소드 구현
    @Override
    void calculationArea() {
        super.setArea(Math.PI * radius * radius);
    }
}
