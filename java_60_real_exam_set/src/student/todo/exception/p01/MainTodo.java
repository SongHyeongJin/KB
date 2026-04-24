package student.todo.exception.p01;

public class MainTodo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        // TODO 1: arr[3] 접근 시 예외를 처리하세요.
        // 예외 발생 시 "예외 발생" 출력
        for (int i = 0; i <= arr.length; i++) {
            try {
                System.out.println("arr["+i+"]: "+arr[i]);
            }catch (ArrayIndexOutOfBoundsException ae){
                System.out.println("예외 발생: "+ae);
            }
        }
    }
}
