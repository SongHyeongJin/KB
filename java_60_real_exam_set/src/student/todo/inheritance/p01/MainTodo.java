package student.todo.inheritance.p01;

class ParentTodo {
    // TODO 1: name 필드 선언
    protected String name = "AAA";
}

class ChildTodo extends ParentTodo {
    // TODO 2: age 필드 선언
    protected int age =10;
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 3: ChildTodo 객체를 생성하고 부모/자식 필드 출력
        ChildTodo childTodo = new ChildTodo();
        System.out.println(childTodo.name);
        System.out.println(childTodo.age);
    }
}
