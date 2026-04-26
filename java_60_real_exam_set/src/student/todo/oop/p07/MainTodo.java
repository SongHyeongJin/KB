package student.todo.oop.p07;

class AccountTodo {
    // TODO 1: private balance 필드
    private int balance;
    // TODO 2: MIN_BALANCE, MAX_BALANCE 상수 선언
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;
    // TODO 3: getBalance()
    public int getBalance() {
        return balance;
    }
    // TODO 4: setBalance(int balance)
    // 범위 밖이면 기존 값 유지
    public void setBalance(int balance) {
        if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
            this.balance = balance;
        }
    }

}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 5: AccountTodo 객체 생성 후 set/get 테스트
        AccountTodo acc = new AccountTodo();

        acc.setBalance(10000);
        System.out.println("현재 잔액: " + acc.getBalance());

        acc.setBalance(-500); // 잘못된 값
        System.out.println("현재 잔액: " + acc.getBalance());

        acc.setBalance(2000000); // 잘못된 값
        System.out.println("현재 잔액: " + acc.getBalance());
    }
}
