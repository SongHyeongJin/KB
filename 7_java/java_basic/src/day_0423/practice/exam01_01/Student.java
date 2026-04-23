package day_0423.practice.exam01_01;

class Student {
    private String name;
    private String subject;
    private int fee;
    private double returnFee;

    public Student(String name, String subject, int fee) {
        this.name = name;
        this.subject = subject;
        this.fee = fee;
    }

    void calcReturnFee() {
        switch (subject) {
            case "javaprogram":
                returnFee = fee * 0.25;
                break;
            case "jspprogram":
                returnFee = fee * 0.2;
                break;
            default:
                System.out.println("그런 과정은 없습니다.");
        }
    }
    void print(){
        System.out.printf("%s 씨의 과정명은 %s이고 교육비는 %d이며 환급금은 %.2f입니다.\n", name, subject, fee, returnFee);
    }

    public static void main(String[] args) {
        Student stu = new Student("차은우", "jspprogram", 500000);
        stu.calcReturnFee();
        stu.print();
    }
}