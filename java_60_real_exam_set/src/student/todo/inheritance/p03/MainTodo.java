package student.todo.inheritance.p03;

class AnimalTodo {
    // TODO 1: run() 작성
    protected void run(){
        System.out.println("달리기");
    }
}

class DogTodo extends AnimalTodo {
    // TODO 2: run() 오버라이딩
    @Override
    protected void run(){
        System.out.println("개가 달립니다.");
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 3: DogTodo 객체 생성 후 run 호출
        DogTodo dog = new DogTodo();
        dog.run();
    }
}
