package student.todo.oop.p08;

class StudentTodo {
    String name;
    int score;

    // TODO 1: 생성자 작성
    StudentTodo(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 2: StudentTodo 배열 생성
        StudentTodo[] students = new StudentTodo[3];
        // TODO 3: 객체 3개 저장
        students[0] = new StudentTodo("홍길동", 80);
        students[1] = new StudentTodo("철수", 90);
        students[2] = new StudentTodo("영희", 70);
        // TODO 4: 합계와 평균 출력
        int sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].score;
        }

        double avg = (double) sum / students.length;

        System.out.println("총합: " + sum);
        System.out.println("평균: " + avg);

    }
}
