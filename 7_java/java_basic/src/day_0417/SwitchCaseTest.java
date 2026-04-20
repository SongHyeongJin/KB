package day_0417;

import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String day;
        System.out.print("요일 입력 : ");
        day = input.nextLine();

        switch (day){
            case "Sunday":
            case "sunday":
            case "일요일":
                System.out.println("야구하기");
                break;
            case "Monday":
            case "monday":
            case "월요일" :
                System.out.println("농구하기");
                break;
            case "Tuesday":
            case "tuesday":
            case "화요일" :
                System.out.println("수영하기");
                break;
            case "Wednesday":
            case "wednesday":
            case "수요일" :
                System.out.println("수영하기");
                break;
            case "Thursday":
            case "thursday":
            case "목요일" :
                System.out.println("계획없음");
                break;
            case "Friday":
            case "friday":
            case "금요일" :
                System.out.println("휴식하기");
                break;
            case "Saturday":
            case "saturday":
            case "토요일" :
                System.out.println("휴식하기");
                break;
        }
    }
}
