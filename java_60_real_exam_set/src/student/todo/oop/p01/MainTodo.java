package student.todo.oop.p01;

class StudentTodo {
    // TODO 1: name 필드 선언 (String)
    String name;
    // TODO 2: studentNo 필드 선언 (String)
    String studentNo;
    // TODO 3: grade 필드 선언 (int)
    int grade;
    // TODO 4: printInfo() 메소드 작성
    // 이름, 학번, 학년을 한 줄씩 출력
    void printInfo(){
        System.out.println("이름: " + name);
        System.out.println("학번: " + studentNo);
        System.out.println("학년: " + grade);
        System.out.println();
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 5: StudentTodo 객체 2개 생성
        StudentTodo stu1 = new StudentTodo();
        StudentTodo stu2 = new StudentTodo();
        // TODO 6: 서로 다른 학생 정보 저장
        stu1.name = "홍길동";
        stu1.studentNo = "2023001";
        stu1.grade = 1;
        stu2.name = "김철수";
        stu2.studentNo = "2023002";
        stu2.grade = 2;
        // TODO 7: 각 객체의 printInfo() 호출
        stu1.printInfo();
        stu2.printInfo();
    }
}
