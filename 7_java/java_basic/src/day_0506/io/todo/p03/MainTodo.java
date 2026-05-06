package day_0506.io.todo.p03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class MainTodo {
    public static void main(String[] args) throws Exception {
        // TODO 1: BufferedWriter 사용
        // TODO 2: 두 줄 쓰기
        Writer writer = new FileWriter("C:/Temp/test6.txt");
        BufferedWriter bw = new BufferedWriter(writer);
        bw.write("B\nA");
        bw.close();
    }
}
