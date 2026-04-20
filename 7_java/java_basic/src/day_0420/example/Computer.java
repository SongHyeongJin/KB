package day_0420.example;

public class Computer extends Calculator{
    @Override
    public double areaCircle(double r){
        System.out.println("Computer 객체의 areaCircle 샐행");
        return Math.PI * r *r;
    }
}
