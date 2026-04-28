package day_0428.collection.p01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: List<String> 생성
        // TODO 2: "Java", "Spring", "Vue" 추가
        // TODO 3: 전체 요소 출력
        List<String> subject  = new ArrayList<>();

        subject.add("Java");
        subject.add("Spring");
        subject.add("Vue");

        for (String s : subject){
            System.out.println(s);
        }
        Iterator iterator = subject.iterator();
        while (iterator.hasNext()){
            String  result = (String) iterator.next();
            System.out.println(result);
        }
    }
}
