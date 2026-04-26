package student.todo.oop.p03;

class RectangleTodo {
    int width;
    int height;

    RectangleTodo(int width, int height) {
        // TODO 1: 필드 초기화
        this.width = width;
        this.height = height;
    }

    // TODO 2: getArea() 작성
    int getArea() {
        return width * height;
    }
    // TODO 3: getPerimeter() 작성
    int getPerimeter() {
        return 2 * (width + height);
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 4: RectangleTodo 객체 생성
        RectangleTodo rectangle = new RectangleTodo(5,10);
        // TODO 5: 넓이와 둘레 출력
        System.out.println("넓이: " + rectangle.getArea());
        System.out.println("둘레: " + rectangle.getPerimeter());
    }
}
