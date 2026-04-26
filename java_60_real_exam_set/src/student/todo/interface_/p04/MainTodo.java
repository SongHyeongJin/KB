package student.todo.interface_.p04;

interface ATodo {
    // TODO 1: method1 선언
    void method1();
}

class BTodo implements ATodo {
    @Override
    public void method1() {
        System.out.println("Btodo method1");
    }
    // TODO 2: method1 구현
}

class CTodo implements ATodo {
    // TODO 3: method1 구현
    @Override
    public void method1() {
        System.out.println("Ctodo method1");
    }
    // TODO 4: method2 작성
    public void method2(){
        System.out.println("CTodo method2");
    }
}

public class MainTodo {
    static void action(ATodo a) {
        // TODO 5: method1 호출, CTodo면 method2 호출
        a.method1();
        if(a instanceof CTodo){
            ((CTodo) a).method2();
        }
    }

    public static void main(String[] args) {
        // TODO 6: action 호출
        BTodo b = new BTodo();
        CTodo c = new CTodo();
        action(b);
        action(c);
    }
}
