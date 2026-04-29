package day_0429.lambda;

public class Main {
    public static void main(String[] args) {
        Calculaor add = (x, y)->x+y;
        Calculaor sub = (x, y)->x-y;
        Calculaor mult = (x, y)->x*y;
        int result = add.calc(10, 20);
        System.out.println(result);
        result = sub.calc(20, 10);
        System.out.println(result);
        result = mult.calc(20, 5);
        System.out.println(result);
    }
}
