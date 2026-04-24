package student.todo.collection.p10;

import java.util.*;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: List<Map<String, Object>> 구조를 사용해 학생 2명 정보 저장 // 이름, 점수 키 사용
        List<Map<String, Object>> mapList = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<>();
        map.put("Song", 80);
        map.put("Kim", 100);
        mapList.add(map);
        // TODO 2: 모든 학생 정보 출력
        System.out.println(mapList);
    }
}
