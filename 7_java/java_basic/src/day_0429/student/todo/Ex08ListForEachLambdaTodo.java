package day_0429.student.todo;

import java.util.Arrays;
import java.util.List;

public class Ex08ListForEachLambdaTodo {
    public static void main(String[] args) {
        List<String> menus = Arrays.asList("아메리카노", "라떼", "모카");

        // TODO: forEach와 람다식을 사용하여 모든 메뉴를 출력하세요.
        menus.forEach(menu-> System.out.println("메뉴: "+ menu));
    }
}
