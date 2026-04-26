package student.todo.interface_.p06;

interface RemoteControlTodo {
    // TODO 1: turnOn 선언
    // TODO 2: default setMute(boolean mute) 작성
    void turnOn();
    default void setMute(boolean mute){
        if(mute){
            System.out.println("무음 설정");
        }else {
            System.out.println("무음 해제");
        }
    }
}

class TelevisionTodo implements RemoteControlTodo {
    // TODO 3: turnOn 구현

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 4: turnOn, setMute 호출
        RemoteControlTodo tv = new TelevisionTodo();
        tv.turnOn();
        tv.setMute(true);
        tv.setMute(false);
    }
}
