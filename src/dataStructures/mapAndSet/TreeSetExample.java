package dataStructures.mapAndSet;

import java.util.TreeSet;

public class TreeSetExample {
    // TreeSet
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("George");
        names.add("Anna");
        names.add("Nikole");

        System.out.println(names.descendingSet());
    }
}
