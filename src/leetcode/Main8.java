package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Main8 {
    public static void main(String[] args) {
        List<List<String>> outside = new ArrayList<>();
        List<String> l1 = new ArrayList<>();
        l1.add("phone");
        l1.add("blue");
        l1.add("pixel");
        outside.add(l1);
        List<String> l2 = new ArrayList<>();
        l2.add("computer");
        l2.add("silver");
        l2.add("lenovo");
        outside.add(l2);

        List<String> l3 = new ArrayList<>();
        l3.add("phone");
        l3.add("gold");
        l3.add("iphone");
        outside.add(l3);
        System.out.println(new Main8().countMatches(
outside, "color", "silver"
        ));
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int index = 0;

        if (ruleKey.equals("type"))
            index = 0;
        if (ruleKey.equals("color"))
            index = 1;
        if (ruleKey.equals("name"))
            index = 2;
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue))
                count++;
        }

        return count;
    }
}
