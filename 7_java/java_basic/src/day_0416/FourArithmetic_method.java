package day_0416;

public class FourArithmetic_method {
    public static void main(String[] args) {
        int a = 12;
        int b = 2;
        String str1 = "Hello, Java";
        float f1 = 3.1254f;

        System.out.printf("안녕 printf()\n");
        System.out.printf("인사말 : %s\n", str1); //문자열 : %s
        System.out.printf("a = %d, b = %d\n", a, b); //정수 : %d
        System.out.printf("fl = %f\n", f1);  //실수 : %f -- 소수점 6자리 표시
        System.out.printf("fl = %.2f\n", f1); //실수 소수점 처리 : %.2f -- 소수점 3번에서 반올림
        System.out.printf("번호: %5d\n", 10); //공간을 5칸 잡고 끝에서부터 채움 -- 우측정렬
        System.out.printf("번호: %-5d\n", 10); //공간을 5칸 잡고 왼쪽부터 채움 -- 좌측정렬
        System.out.printf("번호: %05d\n", 10); //공간을 5칸 잡고 왼쪽부터 채움, 빈칸은 0으로 -- 좌측정렬

        String item = "노트북";
        int quantity = 10;
        double price = 1500000.48;
        System.out.printf("상품명: %s, 현재수량: %d, 한대당 가격: %.1f, 총 금액: %.1f 달러\n", item, quantity, price, (quantity*price));

        double rate = 87.5;
        System.out.printf("성공률: %.1f%%\n",rate);

        String userId = "Admin";
        String action = "Service debugger";
        System.out.printf("[INFO] 사용자 : %s, 요청 : %s \n", userId, action);

        System.out.printf("총 금액 : %,d원 \n", 1000000);
        System.out.printf("주문번호 : ORD-%05d \n",1235);

//        int ack = printfAction();
//        System.out.printf("exit code method :%d\n",ack);
        String ack = printfAction();
        System.out.printf("exit code method :%s\n",ack);
//        fourMethod(a,b);
//        for (int i = 1; i <6; i++) {
//            System.out.printf("== %d번 호출 ==\n",i);
//            fourMethod(a,b);
//        }
    }

    public static void fourMethod(int a, int b) {
        int result = 0;
        result = a + b;
        System.out.printf("a+b=%d\n", result);
        result = a - b;
        System.out.printf("a-b=%d\n", result);
        result = a * b;
        System.out.printf("a*b=%d\n", result);
        if (b > 0)
            result = a / b;
        else
            System.out.println("0으로 나눌 수 없습니다.");
        System.out.printf("a/b=%d\n", result);
    }
//    public static int printfAction(){
//        String str1 = "Hi!";
//        System.out.printf("인사말 : %s\n",str1);
//        return 0;
//    }
    public static String  printfAction(){
        String str1 = "Hi!";
        System.out.printf("인사말 : %s\n",str1);
        return "성공";
    }
}
