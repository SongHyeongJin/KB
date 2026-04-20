package day_0417;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("년도 입력 : ");
        year = input.nextInt();
        if((year%4==0&&year%100 !=0)||year%400==0){
            System.out.println("윤년입니다.");
        }else {
            System.out.println("윤년이 아닙니다.");
        }
    }
}
