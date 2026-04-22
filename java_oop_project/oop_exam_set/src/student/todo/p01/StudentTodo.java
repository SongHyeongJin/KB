package student.todo.p01;

public class StudentTodo {
    // TODO 1: 학생 이름을 저장할 name 필드를 선언하세요. (타입: String)
    // TODO 2: 학생 학번을 저장할 studentNo 필드를 선언하세요. (타입: String)
    // TODO 3: 학생 학년을 저장할 grade 필드를 선언하세요. (타입: int)
    String name;
    String studentNo;
    int grade;

    void printInfo() {
        System.out.printf("이름: %s\n", name);
        System.out.printf("학번: %s\n", studentNo);
        System.out.printf("학년: %d\n", grade);
        System.out.println();
    }
    // TODO 4: 학생 정보를 출력하는 printInfo() 메소드를 작성하세요.
    // 출력 형식:
    // 이름: 김민지
    // 학번: 2026001
    // 학년: 1

}
