package example;

public class ch0303 {
    public static void main(String[] args) {
        int pencils = 534;
        int student = 30;
        int pencilPerStudent = pencils/student;
        System.out.println(pencilPerStudent);
        int pencilsLeft = pencils%student;
        System.out.println(pencilsLeft);
    }
}
