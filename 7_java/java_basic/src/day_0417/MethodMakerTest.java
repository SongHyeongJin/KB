package day_0417;

import java.util.Scanner;

public class MethodMakerTest {

    public static void main(String[] args) {
        //사용자에게 두개의 정수를 전달받아
        //add 라는 메서드를 호출하여 전달받은 두 수의 합의 결과를 받아서 출력하세요
        int n1, n2, result;
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자 입력 : ");
        n1 = scanner.nextInt();
        System.out.print("두번째 숫자 입력 : ");
        n2 = scanner.nextInt();

        result = add(n1,n2);
        System.out.println(result);

    }
    public static int add(int n1, int n2){
        return n1+n2;
    }
}
