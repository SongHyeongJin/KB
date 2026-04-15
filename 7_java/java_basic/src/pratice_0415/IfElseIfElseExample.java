package pratice_0415;

/* score값의구간을검사하여, 점수와등급을출력하는클래스를완성하세요.
  조건:
    0~69   D등급
    70~79  C등급
    80~89  B등급
    90~100 A등급

  출력:
   점수가70~79입니다.
   등급은C입니다.

 */

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score = 75;
        if(score>=90 && score<=100){
            System.out.println("점수가 90~100입니다.");
            System.out.println("등급은 A입니다.");
        } else if (score>=80 && score<=89) {
            System.out.println("점수가 80~89입니다.");
            System.out.println("등급은 B입니다.");
        } else if (score>=70 && score<=79) {
            System.out.println("점수가 70~79입니다.");
            System.out.println("등급은 C입니다.");
        }else if(score>=0 && score<=69){
            System.out.println("점수가 0~69입니다.");
            System.out.println("등급은 D입니다.");
        } else {
            System.out.println("유효하지 않은 점수입니다.");
        }
    }
}