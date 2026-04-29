package day_0429.student.todo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex09StreamFilterMapLambdaTodo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("kim", "lee", "park", "choi");

        // TODO: 이름 길이가 3 이상인 값만 필터링하고 대문자로 변환하여 List로 수집하세요.
        List<String> result = names.stream().filter(name->name.length()>=3).map(name->name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
