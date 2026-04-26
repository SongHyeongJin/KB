package student.todo.oop.p10;

class AccountTodo {
    String ano;
    String owner;
    int balance;

    // TODO 1: 생성자 작성
    AccountTodo(String ano, String owner, int balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }
}

public class MainTodo {
    static AccountTodo[] accountArray = new AccountTodo[100];

    // TODO 2: createAccount(String ano, String owner, int balance)
    static void createAccount(String ano, String owner, int balance) {
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = new AccountTodo(ano, owner, balance);
                System.out.println("계좌 생성 완료");
                break;
            }
        }
    }
    // TODO 3: findAccount(String ano)
    static AccountTodo findAccount(String ano) {
        for (AccountTodo acc : accountArray) {
            if (acc != null && acc.ano.equals(ano)) {
                return acc;
            }
        }
        return null;
    }
    // TODO 4: deposit(String ano, int money)
    static void deposit(String ano, int money) {
        AccountTodo acc = findAccount(ano);
        if (acc != null) {
            acc.balance += money;
            System.out.println("입금 완료");
        } else {
            System.out.println("계좌 없음");
        }
    }
    // TODO 5: withdraw(String ano, int money)
    static void withdraw(String ano, int money) {
        AccountTodo acc = findAccount(ano);
        if (acc != null) {
            if (acc.balance >= money) {
                acc.balance -= money;
                System.out.println("출금 완료");
            } else {
                System.out.println("잔액 부족");
            }
        } else {
            System.out.println("계좌 없음");
        }
    }

    public static void main(String[] args) {
        // TODO 6: 계좌 생성, 예금, 출금 후 결과 출력
        createAccount("111-1", "홍길동", 10000);
        createAccount("222-2", "김철수", 20000);

        deposit("111-1", 5000);
        withdraw("111-1", 3000);

        AccountTodo acc = findAccount("111-1");
        if (acc != null) {
            System.out.println("계좌: " + acc.ano);
            System.out.println("예금주: " + acc.owner);
            System.out.println("잔액: " + acc.balance);
        }
    }
}
