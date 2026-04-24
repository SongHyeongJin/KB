package student.todo.exception.p08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class MainTodo {
    public static void main(String[] args) throws Exception {
        // TODO 1: try-with-resources로 BufferedReader를 생성
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            // TODO 2: 한 줄 읽어서 출력
            String s = bufferedReader.readLine();
//            throw new IOException("에러");
            System.out.println(s);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
