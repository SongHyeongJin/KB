package student.todo.exception.p10;

public class MainTodo {
    public static void main(String[] args) {
        String[] data = {"10", "20", "a"};
        // TODO 1: 숫자로 바꿀 수 있는 값만 합산
        // 결과 30 출력
        int sum=0;
        try {
            for (int i = 0; i < data.length; i++) {
                sum+=Integer.parseInt(data[i]);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println(sum);
        }
    }
}
