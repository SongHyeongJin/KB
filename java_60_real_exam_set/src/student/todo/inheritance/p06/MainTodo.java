package student.todo.inheritance.p06;

class ATodo {
    void method1() {
        System.out.println("A-method1()");
    }
}

class BTodo extends ATodo {
    @Override
    void method1() {
        System.out.println("B-method1()");
    }
}

class CTodo extends ATodo {
    @Override
    void method1() {
        System.out.println("C-method1()");
    }

    // TODO 1: method2() 작성
    void method2(){
        System.out.println("C-method2()");
    }
}

public class MainTodo {
    static void action(ATodo a) {
        a.method1();
        // TODO 2: a가 CTodo이면 method2 호출
        if(a.getClass()== CTodo.class){
            ((CTodo) a).method2();
        }
    }

    public static void main(String[] args) {
        // TODO 3: action 세 번 호출
        ATodo a = new ATodo();
        BTodo b = new BTodo();
        CTodo c = new CTodo();

        action(a);
        action(b);
        action(c);
    }
}
