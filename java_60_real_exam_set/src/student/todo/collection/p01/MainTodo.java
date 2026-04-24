package student.todo.collection.p01;

import java.util.ArrayList;
import java.util.List;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: List<String> 생성
        String [] array;
        List<String> list = new ArrayList<>();
        // TODO 2: "Java", "Spring", "Vue" 추가
        array=new String[]{"Java", "Spring", "Vue"};
        list.add("Java");
        list.add("Spring");
        list.add("Vue");
        // TODO 3: 전체 요소 출력
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
