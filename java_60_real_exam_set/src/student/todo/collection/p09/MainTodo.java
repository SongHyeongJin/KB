package student.todo.collection.p09;

import java.util.ArrayList;
import java.util.List;

class StudentTodo {
    String name;
    int score;

    // TODO 1: 생성자 작성
    StudentTodo(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 2: StudentTodo 리스트 생성
        StudentTodo[] studentTodo = new StudentTodo[3];
        // TODO 3: 객체 3개 추가
        studentTodo[0] = new StudentTodo("kim", 90);
        studentTodo[1] = new StudentTodo("hong",70);
        studentTodo[2] = new StudentTodo("gang", 95);
        // TODO 4: 평균 점수 출력
        double avg=0;
        int sum = 0;
        for (int i = 0; i < studentTodo.length; i++) {
            sum+=studentTodo[i].score;
            avg = (double)sum/studentTodo.length;

        }
        System.out.printf("평균: %.2f\n",avg);
    }
}
