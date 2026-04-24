package student.todo.inheritance.p02;

class ParentTodo {
    String name;

    // TODO 1: ParentTodo(String name) 생성자 작성
    ParentTodo(String name){
        this.name=name;
    }
}

class ChildTodo extends ParentTodo {
    int age;

    // TODO 2: ChildTodo(String name, int age) 생성자 작성
    // super(name) 사용
    ChildTodo(String name, int age){
        super(name);
        this.age=age;
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 3: ChildTodo 객체 생성 및 출력
        ChildTodo childTodo = new ChildTodo("AAA",20);
        System.out.println(childTodo.name+": "+childTodo.age);
    }
}
