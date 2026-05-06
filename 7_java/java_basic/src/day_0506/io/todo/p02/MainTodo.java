package day_0506.io.todo.p02;

import java.io.FileWriter;

public class MainTodo {
    public static void main(String[] args) throws Exception {
        // TODO 1: FileWriter로 test.txt에 "Java" 쓰기
        // TODO 2: close 호출
        FileWriter fileWriter = new FileWriter("C:/Temp/test5.txt");
        fileWriter.write("Java");

        fileWriter.close();
    }
}
