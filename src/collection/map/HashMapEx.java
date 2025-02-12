package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();
        //객체저장
        map.put("최문규",100);
        map.put("이동휘",100);
        map.put("신민혁",100);
        System.out.println(map.size());
        System.out.println("==============");

        //키로 값을 얻기
        String key = "이동휘";
        int value = map.get(key);
        System.out.println();

        //키 Set 컬렉션을 얻고, 반복해서 값을 얻기
        Set<String> keySet = map.keySet();
        Iterator<String> keyiter = keySet.iterator();
        while (keyiter.hasNext()){
            String k =  keyiter.next();
            Integer v = map.get(k);
            System.out.println( k  + ":" + v);

        }


    }
}
