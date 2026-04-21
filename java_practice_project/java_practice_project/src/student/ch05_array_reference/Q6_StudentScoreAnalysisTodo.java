package student.ch05_array_reference;

import java.util.Scanner;

public class Q6_StudentScoreAnalysisTodo {

    public static void main(String[] args) {

        // TODO 1: Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        // TODO 2: 학생 수 변수 선언
        int student;
        // TODO 3: 점수 배열 선언 (아직 생성 X)
        int[] scores = null;
        // TODO 4: while(true) 반복문 작성
        boolean run = true;
        while (run) {
            System.out.println("-------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-------------------------------------------------");
            String select = scanner.nextLine();
            switch (select) {
                case "1":
                    System.out.print("학생수> ");
                    student = Integer.parseInt(scanner.nextLine());
                    scores = new int[student];
                    break;
                case "2":
                    if (scores.length > 0) {
                        for (int i = 0; i < scores.length; i++) {
                            System.out.print("점수>");
                            scores[i] = Integer.parseInt(scanner.nextLine());
                        }
                    } else {
                        System.out.println("학생수를 입력하세요");
                    }
                    break;
                case "3":
                    if (scores.length > 0) {
                        for (int i = 0; i < scores.length; i++) {
                            System.out.println("scores[" + i + "]: " + scores[i]);
                        }
                    } else {
                        System.out.println("학생수를 입력하세요");
                    }
                    break;
                case "4":
                    if (scores.length > 0) {
                        int max = 0;
                        int sum = 0;
                        double avg;
                        for (int i = 0; i < scores.length; i++) {
                            if (max < scores[i]) {
                                max = scores[i];
                                sum += scores[i];
                            }
                        }
                        avg = (double) sum / scores.length;
                        System.out.println("최대값: " + max);
                        System.out.printf("평균 %.1f\n", avg);
                    } else {
                        System.out.println("학생수를 입력하세요");
                    }
                    break;
                case "5":
                    System.out.println("프로그램 종료");
                    run=false;
                    break;
            }
        }
        scanner.close();
        // TODO 5: 메뉴 출력
        // --------------------------------------
        // 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
        // --------------------------------------
        // TODO 6: 사용자 선택 입력 받기 (nextLine 사용)
        // TODO 7: 선택에 따른 기능 구현
        // [1] 학생 수 입력
        // - "학생수>" 출력
        // - 입력값을 정수로 변환
        // - scores 배열 생성
        // [2] 점수 입력
        // - 반복문으로 scores[i] 입력 받기
        // [3] 점수 리스트 출력
        // - scores[i]: 값 형태로 출력
        // [4] 분석
        // - 최대값 구하기
        // - 평균 구하기
        // - 출력
        // [5] 종료
        // - "프로그램 종료" 출력 후 break
        // TODO 8: Scanner 닫기


    }
}