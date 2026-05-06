package day_0506.io.todo.p04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MainTodo {
    public static void main(String[] args) throws Exception {
        // TODO 1: FileReader로 한 글자씩 읽기

        try (Reader reader = new FileReader("C:/Temp/test3.txt")){
            while (true){
                int data = reader.read();
                if(data==-1) break;
                System.out.println((char)data);
            }
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }catch (Exception e){
            e.getMessage();
        }
    }
}
