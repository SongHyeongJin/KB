package day_0420.example;


public class ComputerExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Computer computer = new Computer();

        System.out.println(calc.areaCircle(10));
        System.out.println(computer.areaCircle(10));
    }
}
