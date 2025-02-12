package collection.listEx.sorting.comparator;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//사용자(User) 이름과 나이로 5명(객체)를 생성하고 나이순으로 정렬 한 후  사용자의 이름과 나이를 출력하시오
//ex) 홍길동 32세
//    임준오 48세
public class Main1 {
    public static void main(String[] args) {
        @ToString
        @Getter
        class User {
            private String name;
            private int age;

            User(String name, int age) {
                this.name = name;
                this.age = age;
            }


        }
        //List에 5명의 사용자 저장 후 정렬
        List<User> users = new ArrayList<User>();
        users.add(new User("홍길동", 21));
        users.add(new User("김영희", 24));
        users.add(new User("김병곤", 24));
        users.add(new User("이미진", 30));
        users.add(new User("홍길동", 23));

        Collections.sort(users, Comparator.comparing(User::getAge)); //나이순 정렬
        for (User user : users) System.out.println(user.name + " " + user.age + "세"); //출력

        System.out.println("===========================");
        Collections.sort(users, Comparator.comparing(User::getName)); //이름 오름차순 정렬
        for (User user : users) System.out.println(user.name + " " + user.age + "세"); //출력

        System.out.println("===========================");
        Collections.sort(users, Comparator.comparing(User::getAge).thenComparing(User::getName)); //이름 오름차순 정렬
        for (User user : users) System.out.println(user.name + " " + user.age + "세"); //출력




//

    }
}
