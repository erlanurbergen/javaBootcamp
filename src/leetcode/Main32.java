package leetcode;

import java.util.*;

public class Main32 {
    // 1 2 3 1 -> true
    // 1 2 3 4 -> false
    // Input: names = ["Mary","John","Emma"], heights = [180,165,170]
    // Output: ["Mary","Emma","John"]
    // Explanation: Mary is the tallest, followed by Emma and John.
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(
//                new Main32().sortPeople(new String[]{"Mary","John","Emma"}, new int[]{180,165,170})
//        ));

        Map<Integer, String> data = new HashMap<>();
        data.put(180, "Mary");
        data.put(165, "John");
        data.put(170, "Emma");
        Map<Integer, String> treeMap = new TreeMap<>(data);
        for (Integer str : treeMap.keySet()) {
            System.out.println(str);
        }

    }

    public String[] sortPeople(String[] names, int[] heights) {
        ArrayList<Person123> persons = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            persons.add(new Person123(names[i], heights[i]));
        }
        List<Person123> person123s = persons.stream().sorted(Comparator.comparing(Person123::getHeight)).toList();
        String res[] = new String[person123s.size()];
        int index = 0;
        for (int i = person123s.size() - 1; i >= 0; i--) {
            res[i] = person123s.get(index).getName();
            index++;
        }
        return res;
    }
}

class Person123 {
    private String name;
    private int height;

    public Person123(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height='" + height + '\'' +
                '}';
    }
}
