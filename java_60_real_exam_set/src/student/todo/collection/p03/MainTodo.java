package student.todo.collection.p03;

import java.util.HashSet;
import java.util.Set;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: Set<Integer> 생성
        Set<Integer> list = new HashSet<>();
        // TODO 2: 10, 20, 10, 30 추가
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        // TODO 3: 크기와 요소 출력
        System.out.println(list.size());
        System.out.println(list);
    }
}
