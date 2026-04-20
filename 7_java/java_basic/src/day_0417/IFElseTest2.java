package day_0417;

import java.util.Scanner;

public class IFElseTest2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score;
        System.out.print("점수 입력 : ");
        score = input.nextInt();
        if (score >= 90) {
            System.out.println("A반");
        } else if (score >= 85) {
            System.out.println("B반");
        } else if (score >= 80) {
            System.out.println("C반");
        } else {
            System.out.println("불합격");
        }
    }
}
