package day_0428.sort;

import java.util.Arrays;
import java.util.Comparator;

public class Main3 {
    public static void main(String[] args) {

        class User{
            String name;
            int age;

            public User(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }
        User[] users = {
                new User("홍길동", 25),
                new User("김철수", 20),
                new User("이영희", 29)
        };
        Arrays.sort(
                users, new Comparator<User>() {
                    @Override
                    public int compare(User o1, User o2) {
                        return o1.name.compareTo(o2.name);
                    }
                }
        );
        //java8 람다식 축약기능 제공



        for (User user : users){
            System.out.println(user.name+" : "+user.age);
        }
    }
}
