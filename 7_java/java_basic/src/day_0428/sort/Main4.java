package day_0428.sort;

import java.util.Arrays;
import java.util.Comparator;

//만약 나이순으로 정렬했는데, 나이가 같은 사람이 있을 경우 추가적인 이름순으로 정렬
//객체의 여러 속성을 이용하여 정렬하기 위해 Comparator의 compare(), thenComparing()이용한 체이닝 구현이 가능하다.
//객체의 속성을 이용시 setter/getter 가 필요하다.
public class Main4 {
    public static void main(String[] args) {

        class User{
            private String name;
            private int age;

            public User(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }
        }
        User[] users = {
                new User("홍길동", 25),
                new User("김민수", 25),
                new User("김철수", 20),
                new User("임민철", 20),
                new User("이영희", 29)
        };
        Arrays.sort(
                users, Comparator.comparing(User::getAge)
        );
        //java8 람다식 축약기능 제공
        


        for (User user : users){
            System.out.println(user.name+" : "+user.age);
        }
        System.out.println("\n");

        Arrays.sort(
                users, Comparator.comparing(User::getName) //이름순 정렬
        );
        for (User user : users){
            System.out.println(user.name+" : "+user.age+"세");
        }
        System.out.println("\n");

        Arrays.sort(
                users, Comparator.comparing(User::getAge).thenComparing(User::getName)
        );
        for (User user : users){
            System.out.println(user.name+" : "+user.age+"세");
        }
    }
}
