package day_0417;

import java.util.Scanner;

public class ArithmeticOperTest {
    public static void main(String[] args) {
        int digit;
        Scanner input = new Scanner(System.in);
        System.out.print("값 입력 : ");
        digit = input.nextInt();
        System.out.println(digit%10);
        System.out.println(digit/10%10);
        System.out.println(digit/100%10);
        System.out.println(digit/1000%10);

        int number = 2579;
        if(number%2 ==0){
            System.out.println("짝수");
        }else {
            System.out.println("홀수");
        }
    }
}
