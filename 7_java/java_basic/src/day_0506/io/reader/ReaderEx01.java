package day_0506.io.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx01 {
    public static void main(String[] args) {
        //C:/Temp/test3.txt 파일에 있는 문자 데이터를 ReaderEx01.java 파일로 읽어와서 콘솔창에 데이터를 출력

        try{
            Reader reader = null;
            reader = new FileReader("C:/Temp/test3.txt");
            //while1 한문자씩 읽어와서 콘솔 출력
            while (true){
                int data = reader.read();
                if(data==-1) break;
                System.out.println((char)data);
            }
            reader.close();
            System.out.println();
            //while2 문자배열에 담아서 콘솔 출력
            reader = new FileReader("C:/Temp/test3.txt");
            char[] chars = new char[100];
//            while (true){
//                int number = reader.read(chars);
//                if(number == -1) break;
//                for (char aChar : chars) {
//                    System.out.println(aChar);
//                }
//            }
            while (true){
                int number = reader.read(chars);
                if(number == -1) break;
                for (int i = 0; i < number; i++) {
                    System.out.println(chars[i]);
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }catch (Exception e){
            e.getMessage();
        }
    }
}
