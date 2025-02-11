package genericEx.lamdaEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("functional", "programming","with","generics","in","Java");

        List<String> filteredWords = words.stream()
                .filter(word -> word.length() > 4)
                .map(word -> word.toUpperCase())
                .collect(Collectors.toList());


        System.out.println(filteredWords);


    }
}
