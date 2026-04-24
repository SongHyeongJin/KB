package student.todo.interface_.p01;

interface RemoteControlTodo {
    // TODO 1: powerOn() 선언
    void poweron();
}

class TVTodo implements RemoteControlTodo {
    @Override
    public void poweron() {
        System.out.println("전원을 킵니다.");
    }
    // TODO 2: powerOn() 구현
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 3: 인터페이스 타입으로 TVTodo 객체 사용
        RemoteControlTodo tv = new TVTodo();
        tv.poweron();
    }
}
