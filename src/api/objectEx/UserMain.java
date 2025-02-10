package api.objectEx;

import java.util.Arrays;

public class UserMain {
    public static void main(String[] args) throws CloneNotSupportedException {

        //얕은 복사(shallow copy)
//        User user = new User();
//        //user.setName("Shin");
//        User copy = user;
//
//        System.out.println(user.hashCode());
//        System.out.println(copy.hashCode());
//        System.out.println(user.equals(copy));
//
        //깊은 복사(deep copy)
//        try {
//            User user1 = new User();
//            //user1.setName("Shin");
//            User copy1 =  (User)user1.clone();
//
//            System.out.println(user1.hashCode());
//            System.out.println(copy1.hashCode());
//            System.out.println(user1.equals(copy1));
//
//        } catch (CloneNotSupportedException e) {
//            throw new RuntimeException(e);
//        }

        User[] arrayObj = {new User(100,"park"),new User(101,"kim"),new User(102,"kang")};
        System.out.println(Arrays.toString(arrayObj));

        User[] arrayObj1 = new User[3];
        //복제할 array 선언
        for(int i = 0; i < arrayObj.length;i++){
            arrayObj1[i] = arrayObj[i].clone();
        }

        //arrayObj1 = arrayObj.clone();
        System.out.println(Arrays.toString(arrayObj1));

        System.out.println(arrayObj[0].getId());
        System.out.println(arrayObj1[0].getId());
        arrayObj1[0].setId(999);    //복사한 arrayobj1의 첫번째 객체의 멤버값을 변경

        //원본과 복사본의 값이 다름 확인
        System.out.println(arrayObj[0].getId());
        System.out.println(arrayObj1[0].getId());


    }
}
//  복제되는 대상이 배열의 요소데이터인 Object.clone() 오버라이딩을 해줌으로써 직접 for문을 돌며 객체복사