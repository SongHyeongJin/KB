package student.todo.interface_.p07;

interface CalculableTodo {
    // TODO 1: static add(int x, int y) 작성
    static int add(int x, int y){
        return x+y;
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 2: 인터페이스명으로 add 호출
        int result = CalculableTodo.add(1,2);
        System.out.println(result);
    }
}
