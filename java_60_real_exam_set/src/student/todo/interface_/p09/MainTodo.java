package student.todo.interface_.p09;

interface VehicleTodo {
    // TODO 1: run 선언
    void run();
}

class AnonymousTodo {
    // TODO 2: field에 익명 구현 객체 대입
    VehicleTodo field = new VehicleTodo() {
        @Override
        public void run() {
            System.out.println("익명 객체 필드 실행");
        }
    };


    void method1() {
        // TODO 3: localVar에 익명 구현 객체 대입 후 run 호출
        VehicleTodo localVar = new VehicleTodo() {
            @Override
            public void run() {
                System.out.println("로컬 익명 객체 실행");
            }
        };
        localVar.run();
    }

    void method2(VehicleTodo v) {
        v.run();
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 4: 필드, method1, method2(익명객체) 실행
        AnonymousTodo anonymous = new AnonymousTodo();
        anonymous.field.run();
        anonymous.method1();
        anonymous.method2(new VehicleTodo() {
            @Override
            public void run() {
                System.out.println("매개변수 익명 객체 실행");
            }
        });
    }
}
