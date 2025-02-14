package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class TestMain1 {
    public static void main(String[] args) {
//         Runnable runnable = new Runnable() {
//             @Override
//             public void run() {
//                 System.out.println("Hello from a thread");
//             }
//         };
//
//         Runnable runnable1 = () -> System.out.println("Hello from a thread");

//

        // 람다표현식을 사용하여 "Hello Java!!" 열번 출력하는 간단한 스레드 생성하세요

//        Runnable task1 = () -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("Hello Java");
//            }
//        };
//
//        Runnable task2 = () -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("Hello World");
//            }
//        };
//
//        Thread thread1 = new Thread(task1);
//        Thread thread2 = new Thread(task2);
//        thread1.start();
//        thread2.start();

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        numbers.stream().filter(num -> num %2 == 1).forEach(System.out::println);







    }
}
