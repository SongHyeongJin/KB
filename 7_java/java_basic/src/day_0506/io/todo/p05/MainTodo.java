package day_0506.io.todo.p05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class MainTodo {
    public static void main(String[] args) throws Exception {
        // TODO 1: BufferedReader로 첫 줄 읽고 출력
        Reader reader = new FileReader("C:/Temp/test3.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        while (true){
            String str = bufferedReader.readLine();
            if(str==null)break;
            System.out.println(str);
        }
        bufferedReader.close();
    }
}
