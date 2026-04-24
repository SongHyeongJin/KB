package student.todo.exception.p03;

public class MainTodo {
    public static void main(String[] args) {
        String s = null;
        // TODO 1: NullPointerException 또는 NumberFormatException을 한 번에 처리
        try {
            System.out.println(s.length());
        }catch (NullPointerException| NumberFormatException e){
            System.out.println("null값이거나 잘못된 형식 에러");
        }
    }
}
