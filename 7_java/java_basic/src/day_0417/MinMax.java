package day_0417;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("첫번째 숫자  : ");
        int num1 = input.nextInt();
        System.out.print("두번째 숫자  : ");
        int num2 = input.nextInt();

        int min = (num1<num2) ? num1:num2;
        int max = (num1>num2) ? num1:num2;
        System.out.println("Min value : "+min+" Max value : "+max);
    }
}
