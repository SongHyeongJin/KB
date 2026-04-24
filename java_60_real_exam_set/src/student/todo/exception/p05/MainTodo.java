package student.todo.exception.p05;

class CalcTodo {
    // TODO 1: divide(int a, int b)를 작성하세요.
    // throws ArithmeticException
    public int divide(int a, int b) throws ArithmeticException{
        return a/b;
    }
}

public class MainTodo {
    public static void main(String[] args) {
        CalcTodo calcTodo = new CalcTodo();
        int a=4;
        int b=0;
        // TODO 2: divide 호출
        try {
            int result = calcTodo.divide(a,b);
            System.out.println(a+"/"+b+"="+result);
        }catch (ArithmeticException e){
            System.out.println("연산 에러: "+e);
        }
    }
}
