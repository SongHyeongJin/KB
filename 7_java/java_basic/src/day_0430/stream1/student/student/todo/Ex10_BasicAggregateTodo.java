package day_0430.stream1.student.student.todo;

import java.util.Arrays;

public class Ex10_BasicAggregateTodo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        // TODO: 짝수 기준 count, sum, average, max, min을 구하고 출력하세요.
        long count = Arrays.stream(arr).filter(n->n%2==0).count();
        System.out.println("짝수 count결과: "+count);
        int sum = Arrays.stream(arr).filter(n->n%2==0).sum();
        System.out.println("짝수 sum결과: "+sum);
        double average = Arrays.stream(arr).filter(n->n%2==0).average().getAsDouble();
        System.out.println("짝수 average결과: "+average);
        int max = Arrays.stream(arr).filter(n->n%2==0).max().getAsInt();
        System.out.println("짝수 max결과: "+max);
        int min = Arrays.stream(arr).filter(n->n%2==0).min().getAsInt();
        System.out.println("짝수 min결과: "+min);
        // TODO: 3의 배수 중 첫 번째 값을 findFirst로 구하세요.

        int three = Arrays.stream(arr).filter(n->n%3==0).findFirst().getAsInt();
        System.out.println("3의 배수 중 첫 번째 값: "+three);
    }
}
