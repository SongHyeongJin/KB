package student.ch04_control;

import java.util.Scanner;

public class Q06_BankApplicationTodo {
    public static void main(String[] args) {

        // TODO 1: Scanner 객체 생성
        // TODO 2: 잔고(balance) 변수 선언 (초기값 0)
        // TODO 3: while(true) 반복문 작성
        // TODO 4: 메뉴 출력
        // ----------------------------------
        // 1.예금 | 2.출금 | 3.잔고 | 4.종료
        // ----------------------------------
        // TODO 5: 사용자 선택 입력 받기 (nextLine 사용)
        // TODO 6: if 또는 switch로 기능 구현
        // [1] 예금
        // - "예금액>" 출력
        // - 금액 입력 받아 balance에 더하기
        // [2] 출금
        // - "출금액>" 출력
        // - 금액 입력 받아 balance에서 빼기
        // [3] 잔고 조회
        // - "잔고>" + balance 출력
        // [4] 종료
        // - "프로그램 종료" 출력
        // - break로 반복문 종료
        // TODO 7: Scanner 닫기
        Scanner scanner = new Scanner(System.in);
        int balance = 0;
        boolean run=true;
        String  select;
        int money;
        while (run){
            System.out.println("------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------");
            System.out.print("메뉴 선택> ");
            select = scanner.nextLine();
            switch (select){
                case "1":
                    System.out.print("예금액> ");
                    money = Integer.parseInt(scanner.nextLine());
                    balance+=money;
                    break;
                case "2":
                    System.out.print("출금액> ");
                    money = Integer.parseInt(scanner.nextLine());
                    if(balance>=money){
                    balance-=money;}
                    else System.out.println("잔고가 부족합니다.");
                    break;
                case "3":
                    System.out.printf("잔고> %d\n", balance);
                    break;
                case "4":
                    System.out.println("프로그램 종료");
                    run=false;
                    break;
                default:
                    System.out.println("1번부터 4번까지의 숫자를 입력하세요.");
                    break;
            }
        }
        scanner.close();
    }
}
