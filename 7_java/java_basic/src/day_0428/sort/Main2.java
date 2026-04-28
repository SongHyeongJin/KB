package day_0428.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main2 {
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
//        Arrays.sort(
//                users, new Comparator<User>() {
//                    @Override
//                    public int compare(User o1, User o2) {
//                        return Integer.compare(o1.age, o2.age);
//                    }
//                }
//        );
        //java8 람다식 축약기능 제공
        Arrays.sort(users,(u1, u2)->Integer.compare(u1.age, u2.age));


        for (User user : users){
            System.out.println(user.name+" : "+user.age);
        }
    }
}
