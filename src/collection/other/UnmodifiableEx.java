package collection.other;

import java.util.*;

public class UnmodifiableEx {   //수정할 수 없는 컬렉션

    public static void main(String[] args) {
        //수정할 수 없는 컬렉션 만드는 방법
        //1. of()
        List<String>  immutableList1 = List.of("A","B","C");
        //immutableList1.add("E");

        Set<String> immutableSet1 = Set.of("A","B","C");
        //immutableSet1.remove("C");

        Map<Integer,String> immutableMap1 = Map.of(1,"A" , 2,"B" , 3,"C");
        //immutableMap1.put(4,"D");

        //List 컬렉션을 불변 컬렉션으로 복사
        List<String>  list2 =new ArrayList<>();
        list2.add("A");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        List<String> immuntableList2 = List.copyOf(list2);

        //배열로부터 List 불변 컬렉션으로 생성
          String array[] = new String[5];
          array[0] = "A";
          array[3] = "D";
          for(String s : array) System.out.print(s + " ");

        System.out.println();
          List<String> immString3 = Arrays.asList(array);
        for(String s : immString3) System.out.print(s + " ");




    }

}



