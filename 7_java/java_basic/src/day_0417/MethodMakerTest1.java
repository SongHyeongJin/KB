package day_0417;

import java.util.Scanner;

class MethodAdd{
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int minus(int n1, int n2){
        return n1-n2;
    }
}

public class MethodMakerTest1 {

    public static void main(String[] args) {
        //사용자에게 두개의 정수를 전달받아
        //add 라는 메서드를 호출하여 전달받은 두 수의 합의 결과를 받아서 출력하세요
        int n1, n2, result;
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자 입력 : ");
        n1 = scanner.nextInt();
        System.out.print("두번째 숫자 입력 : ");
        n2 = scanner.nextInt();

        MethodAdd hj = new MethodAdd();
        result = hj.add(n1,n2);
        System.out.println("hj add 결과 : "+result);
        result = hj.minus(n1,n2);
        System.out.println("hj minus 결과 : "+result);
    }

}
