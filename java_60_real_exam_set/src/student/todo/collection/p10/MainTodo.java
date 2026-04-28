package student.todo.collection.p10;

import java.util.*;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: List<Map<String, Object>> 구조를 사용해 학생 2명 정보 저장 // 이름, 점수 키 사용
        List<Map<String, Object>> mapList = new ArrayList<Map<String, Object>>();
        Map<String, Object> map1 = new HashMap<>();
        Map<String, Object> map2 = new HashMap<>();
        map1.put("name", "Song");
        map1.put("value", 80);
        map2.put("name", "Kim");
        map2.put("value", 100);
        mapList.add(map1);
        mapList.add(map2);
        // TODO 2: 모든 학생 정보 출력
        System.out.println(mapList);
        for (Map<String, Object> student : mapList){
            String name = (String) student.get("name");
            int score = (int) student.get("value");
            System.out.println(name+" : "+ score);
        }
    }
}
