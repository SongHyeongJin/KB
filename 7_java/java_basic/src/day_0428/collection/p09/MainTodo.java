package day_0428.collection.p09;

import java.util.ArrayList;
import java.util.List;

class StudentTodo {
    String name;
    int score;

    // TODO 1: 생성자 작성

    public StudentTodo(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 2: StudentTodo 리스트 생성
        List<StudentTodo> studentTodoList = new ArrayList<>();
        // TODO 3: 객체 3개 추가
        studentTodoList.add(new StudentTodo("김민성",90 ));
        studentTodoList.add(new StudentTodo("최민지",80 ));
        studentTodoList.add(new StudentTodo("이민규",70 ));
        // TODO 4: 평균 점수 출력
        int totalScore = 0;
        for(StudentTodo studentTodo : studentTodoList){
            totalScore+=studentTodo.score;
        }
        System.out.printf("평균 : %d",(totalScore/studentTodoList.size()));
    }
}
