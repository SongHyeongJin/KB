package day_0417;

import java.util.Scanner;

public class IfbasicTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("정수 입력 : ");
        num = input.nextInt();
        if(num%7==0){
            System.out.println("7의 배수입니다.");
        }else {
            System.out.println("7의 배수가 아닙니다.");
        }
    }
}
