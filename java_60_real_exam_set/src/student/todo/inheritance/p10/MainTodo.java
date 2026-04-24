package student.todo.inheritance.p10;

class EmployeeTodo {
    void work() {
        System.out.println("직원이 일합니다.");
    }
}

class DeveloperTodo extends EmployeeTodo {
    // TODO 1: work() 오버라이딩

    @Override
    void work() {
        System.out.println("개발자가 일합니다.");
    }
}

class DesignerTodo extends EmployeeTodo {
    // TODO 2: work() 오버라이딩

    @Override
    void work() {
        System.out.println("디자이너가 일합니다.");
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 3: EmployeeTodo 배열에 두 객체 저장 후 순회
        EmployeeTodo[] employee = new EmployeeTodo[2];
        employee[0] = new DeveloperTodo();
        employee[1] = new DesignerTodo();
        for (int i = 0; i < employee.length; i++) {
            employee[i].work();
        }
    }
}
