package day_0422.practice;

import java.util.Scanner;
//BufferedReader(new InputStreamReader(System.in)) 사용하셔도 됩니다.

public class Prob1 {
    //필요할 경우 다음의 메서드 선언부분(메서드 시그너처)을 수정하시기 바랍니다.
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("숫자로 변환할 문자열을 입력바랍니다.");
        String str= scan.nextLine(); //Enter 키를 입력받기까지 문자열 입력
        int result= 0;
        try {
            result = convert(str);
            System.out.println("변환된 숫자는 "+result+"입니다.");
        }catch (IllegalArgumentException e){
            System.out.println("예외가 발생했습니다. 문자열을 입력하지 않고 Enter키를 누르셨습니다.");
        }catch (Exception e1){
            System.out.println();
        }

        //여기를 작성하십시오.
    }

    //필요할 경우 다음의 메서드 선언부분(메서드 시그너처)을 수정하시기 바랍니다.
//    private static int convert(String str) throws IllegalArgumentException {
//        //여기를 작성하십시오.
//        int result =0;
//        result = Integer.parseInt(str);
//        return result;
//    }
    private static int convert(String str){
        if(str==null|| str.isEmpty()){
            throw new IllegalArgumentException();
        }
        return Integer.parseInt(str);
    }

}