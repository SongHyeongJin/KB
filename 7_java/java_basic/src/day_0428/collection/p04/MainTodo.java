package day_0428.collection.p04;

import java.util.HashMap;
import java.util.Map;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: Map<String, Integer> 생성
        Map<String, Integer> scores = new HashMap<>();
        // TODO 2: 국어 90, 영어 80, 수학 95 저장
        scores.put("국어", 90);
        scores.put("영어", 80);
        scores.put("수학", 95);
        // TODO 3: 영어 점수 출력
        System.out.println(scores.size());
//        System.out.println(scores.get("영어"));
//        Integer engScore = scores.get("영어");
//        Integer mathScore = scores.get("수학");
//        Integer korScore = scores.get("국어");
//        System.out.println("영어점수 : "+engScore);
//        System.out.println("수학점수 : "+mathScore);
//        System.out.println("국어점수 : "+korScore);

        for (Map.Entry<String, Integer> entry : scores.entrySet()){
            System.out.println(entry.getKey()+"점수 : "+entry.getValue());
        }
    }
}
