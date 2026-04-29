package day_0429.student.todo;

import java.util.Optional;

public class Ex10OptionalLambdaTodo {
    public static void main(String[] args) {
        String email = null;

        // TODO: Optional과 람다를 사용하여 email이 null이면 "이메일 없음"을 출력하세요.
        String result = Optional.ofNullable(email).map(value->"이메일: "+value)
                .orElse("이메일 없음");

        System.out.println(result);
    }
}
