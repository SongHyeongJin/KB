package student.todo.exception.p02;

public class MainTodo {
    public static void main(String[] args) {
        String s = "abc";
        // TODO 1: Integer.parseInt(s) 예외 처리
        try {
            int result = Integer.parseInt(s);
            System.out.println(result);
        }catch (NumberFormatException e){
            System.out.println("형변환 에러: "+e);
        }
    }
}
