package day_0506.io.todo.p06;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class MainTodo {
    public static void main(String[] args) throws Exception {
        // TODO 1: try-with-resources로 BufferedWriter 사용
        String filename = "C:/Temp/test7.txt";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write("test중");
        }catch (IOException e){
            throw new RuntimeException(e);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
