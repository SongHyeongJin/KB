package day_0423.study.member;

public class MemberTest {
    public static void main(String[] args) {
        Member member = new Member("홍길동", 30, "101-1111-1111", "fc@naver.com","서울", 57.6);
        System.out.printf("이름: %s, 나이: %d, 전화번호: %s, 이메일: %s, 주소: %s, 몸무게:%.1f",member.getName(),member.getAge(),member.getCall(),member.getEmail(),member.getAddress(),member.getKillo());
    }
}
