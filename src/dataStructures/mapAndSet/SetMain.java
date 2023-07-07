package dataStructures.mapAndSet;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        // Что такое set
        // Методы
        // add
        // remove
        // size
        // isEmpty
        // contains
        // Что такое set

        Set<String> data = new HashSet<>();
        data.add("Erlan");
        data.add("Arman");

//        data.remove("Arman");

//        for (String datum : data) {
//            System.out.println(datum);
//        }

//        System.out.println(data.size());
//        System.out.println(data.isEmpty());
        System.out.println(data.contains("Arman"));
    }
}
