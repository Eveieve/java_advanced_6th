package collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        //객체 저장
        set.add("Java");
        set.add("Java");
        set.add("Programming");
        set.add("perfect");
        set.add("Spring");

        //저장된 객체 수 확인
        int size = set.size();
        System.out.println(size);
    }
}
