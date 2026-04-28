package day_0428.sort;

import java.util.Arrays;
import java.util.Collections;

public class Main1 {
    public static void main(String[] args) {

        class User implements  Comparable<User>{
            String name;
            int age;

            public User(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public int compareTo(User o) {
                if(this.age<o.age){
                    return -1;
                } else if (this.age==o.age) {
                    return 0;
                }else {
                    return 1;
                }
            }
        }
        User[] users = {
                new User("홍길동", 25),
                new User("김철수", 20),
                new User("이영희", 29)
        };
        System.out.println("Sort 전==============");
        for (User user: users){
            System.out.println(user.name+"=> "+user.age);
        }
        //나이순으로 users를 정렬하여 출력하세요
        Arrays.sort(users);
        System.out.println("Sort 후==============");
        for (User user: users){
            System.out.println(user.name+"=> "+user.age);
        }
        Arrays.sort(users, Collections.reverseOrder());
        System.out.println("역순 Sort 후==============");
        for (User user: users){
            System.out.println(user.name+"=> "+user.age);
        }
    }
}
