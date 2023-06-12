package leetcode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main9 {
    // 1859. Sorting the Sentence
    public static void main(String[] args) {
        // Input: s = "is2 sentence4 This1 a3"
        // Output: "This is a sentence"
        System.out.println(new Main9().sortSentence("is2 sentence4 This1 a3"));

    }

    public String sortSentence(String s) {
        String[] s1 = s.split(" ");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)))
                numbers.add(Character.getNumericValue(s.charAt(i)));
        }
        List<Integer> integers = numbers.stream().sorted().toList();
        String massive[] = new String[s1.length];
        for (int i = 0; i < integers.size(); i++) {
            for (int j = 0; j < s1.length; j++) {
                if (s1[j].contains(Integer.toString(integers.get(i)))){
                    massive[i] = s1[j];
                }
            }
        }
        String collect = Stream.of(massive)
                .collect(Collectors.joining(" "));
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < collect.length(); i++) {
            if (Character.isDigit(collect.charAt(i)))
                continue;
            else
                res.append(collect.charAt(i));
        }
        return res.toString();
    }
}
