package day_0429.student.todo;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class Ex03SupplierLambdaTodo {
    public static void main(String[] args) {
        // TODO: Supplier<String>을 사용하여 현재 시간을 포함한 주문번호를 생성하세요.
        Supplier<String> orderNoSupplier = ()->"ORDER-"+LocalDateTime.now();

        System.out.println(orderNoSupplier.get());
    }
}
