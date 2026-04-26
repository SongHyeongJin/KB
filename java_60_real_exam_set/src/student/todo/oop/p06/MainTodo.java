package student.todo.oop.p06;

class ShopServiceTodo {
    // TODO 1: private static final 싱글톤 객체 선언
    private static final ShopServiceTodo instance = new ShopServiceTodo();
    // TODO 2: private 생성자 작성
    private ShopServiceTodo() {
    }
    // TODO 3: public static getInstance() 작성
    public static ShopServiceTodo getInstance() {
        return instance;
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 4: getInstance() 두 번 호출하여 같은 객체인지 비교
        ShopServiceTodo s1 = ShopServiceTodo.getInstance();
        ShopServiceTodo s2 = ShopServiceTodo.getInstance();

        System.out.println(s1 == s2);
    }
}
