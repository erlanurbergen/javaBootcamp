package leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main22 {
    // 2418. Sort the People
    public static void main(String[] args) {
        System.out.println(new Main22().sortPeople(new String[]{"Mike", "sam"},
                new int[]{185, 44}));
    }
    public String[] sortPeople(String[] names, int[] heights) {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            Person p = new Person();
            p.setName(names[i]);
            p.setHeight(heights[i]);
            personList.add(p);
        }

        List<Person> personList1 = personList.stream().sorted(Comparator.comparing(Person::getHeight)).toList();
        String data[] = new String[names.length];
        int index = 0;
        for (int i = personList.size() - 1; i >= 0; i--) {
            data[index] = personList1.get(i).getName();
            index++;
        }
        return data;
    }
}

class Person {
    private String name;
    private int height;

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
                ", height=" + height +
                '}';
    }
}
