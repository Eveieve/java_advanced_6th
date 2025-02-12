package collection.listEx.sorting;
//사용자(User) 이름과 나이로 5명(객체)를 생성하고 나이순으로 정렬 한 후  사용자의 이름과 나ㅏ이를 출력하시오
//ex) 홍길동 32세
//    임준오 48세
public class Main {
    public static void main(String[] args) {

        class User implements Comparable<User>{
             String name;
             int age;

             User(String name, int age){
                 this.name = name;
                 this.age = age;
             }


            @Override
            public int compareTo(User o) {
                return 0;
            }
        }
    }
}
