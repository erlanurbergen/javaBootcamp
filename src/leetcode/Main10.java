package leetcode;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main10 {
    // 1662. Check If Two String Arrays are Equivalent
    public static void main(String[] args) {
        System.out.println(new Main10().arrayStringsAreEqual(
                new String[]{"ab", "c"}, new String[]{"a", "bc"}
        ));
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String collect = Stream.of(word1)
                .collect(Collectors.joining(""));
        String collect2 = Stream.of(word2)
                .collect(Collectors.joining(""));
        return collect.equals(collect2);
    }
}
