package day_0427.Generic;

class Box<T>{
    public T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public boolean compare(Box<T> other){
        boolean result = content.equals(other.content);
        return result;
    }
}
class Doll{
    String type = "바비인형";
}
public class BoxTest {
    public static void main(String[] args) {
        Doll doll = new Doll();
        Box<Doll> dollBox = new Box<Doll>();
        dollBox.setContent(doll);
        System.out.println(dollBox.getContent().type);
    }
}
