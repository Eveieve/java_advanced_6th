package collection.tree.treemap;


import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<String, Integer > treeMap = new TreeMap<>();

        //엔트리 저장
        treeMap.put("apple",1000);
        treeMap.put("banana",500);
        treeMap.put("grape",3000);
        treeMap.put("applemango",5000);
        treeMap.put("pear",2000);

        //정렬된 엔트리를 하나씩 가져와 보자
        Set<Map.Entry<String,Integer>> entrySet = treeMap.entrySet();
        for(Map.Entry<String, Integer> entry :entrySet) System.out.println(entry.getKey() + ": " + entry.getValue());

        System.out.println();

        //특정 키에 대한 값을 가져오고 싶다.
        Map.Entry<String ,Integer> entry = null;
        entry = treeMap.firstEntry();
        System.out.println("제일 앞에 저장된 과일명 :" + entry.getKey());

        //내림차순으로 정렬하기
        NavigableMap<String, Integer> descendingMap = treeMap.descendingMap();
        Set<Map.Entry<String,Integer>> descendingSet = descendingMap.entrySet();
        for(Map.Entry<String,Integer> e : descendingSet) System.out.println(e.getKey());








    }
}
