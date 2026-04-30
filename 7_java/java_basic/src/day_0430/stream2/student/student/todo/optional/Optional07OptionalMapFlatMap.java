package student.todo.optional;

import common.*;
import java.util.*;

/**
 * 문제 7. Optional<Employee>에서 이메일 Optional을 평탄화하여 반환하라.
 * 요구 리턴 타입: Optional<String>
 */
public class Optional07OptionalMapFlatMap {
    public static Optional<String> solve(Optional<Employee> employee) {
        // TODO 1. SampleData에서 필요한 데이터를 가져오세요.
        // TODO 2. stream(), filter(), map(), collect(), Optional, 집계 메서드 중 필요한 기능을 조합하세요.
        // TODO 3. 문제에서 요구한 타입으로 결과를 반환하세요.
        throw new UnsupportedOperationException("TODO: 학생이 직접 구현하세요");
    }
    public static void main(String[] args) {
        System.out.println(solve(Optional.of(SampleData.employees().get(0))));
    }
}
