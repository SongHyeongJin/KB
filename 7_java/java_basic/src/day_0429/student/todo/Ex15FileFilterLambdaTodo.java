package day_0429.student.todo;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Collectors;


public class Ex15FileFilterLambdaTodo {
    public static void main(String[] args) {
        File dir = new File("./day_0429/student/todo");

        // TODO: 람다식을 사용하여 현재 폴더에서 .java 파일 이름만 배열로 가져오세요.
        String[] javaFiles = Arrays.stream(dir.list())
                .filter(n->n.endsWith(".java"))
                .toArray(String[]::new);

        if (javaFiles != null) {
            for (String fileName : javaFiles) {
                System.out.println(fileName);
            }
        }
    }
}
