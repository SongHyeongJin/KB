package student.todo.oop.p09;

import java.util.Scanner;

class ScoreManagerTodo {
    int[] scores;

    // TODO 1: setStudentCount(int count)
    void setStudentCount(int count) {
        scores = new int[count];
    }
    // TODO 2: inputScores(Scanner sc)
    void inputScores(Scanner sc) {
        if (scores == null) {
            System.out.println("학생수를 먼저 설정하세요.");
            return;
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.print("scores[" + i + "]> ");
            scores[i] = sc.nextInt();
        }
    }
    // TODO 3: printScores()
    void printScores() {
        if (scores == null) {
            System.out.println("학생수를 먼저 설정하세요.");
            return;
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "]: " + scores[i]);
        }
    }
    // TODO 4: analyze()
    void analyze() {
        if (scores == null) {
            System.out.println("학생수를 먼저 설정하세요.");
            return;
        }
        int sum = 0;
        int max = scores[0];

        for (int score : scores) {
            sum += score;
            if (score > max) {
                max = score;
            }
        }

        double avg = (double) sum / scores.length;

        System.out.println("최고 점수: " + max);
        System.out.println("평균 점수: " + avg);
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 5: ScoreManagerTodo와 Scanner를 이용한 메뉴형 프로그램 작성
        Scanner sc = new Scanner(System.in);
        ScoreManagerTodo manager = new ScoreManagerTodo();

        boolean run = true;

        while (run) {
            System.out.println("----------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수출력 | 4.분석 | 5.종료");
            System.out.println("----------------------------------");
            System.out.print("선택> ");

            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("학생수> ");
                    int count = sc.nextInt();
                    manager.setStudentCount(count);
                    break;

                case 2:
                    manager.inputScores(sc);
                    break;

                case 3:
                    manager.printScores();
                    break;

                case 4:
                    manager.analyze();
                    break;

                case 5:
                    run = false;
                    break;
            }
        }

        System.out.println("프로그램 종료");
    }
}
