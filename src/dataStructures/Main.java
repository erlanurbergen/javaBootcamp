package dataStructures;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // массивы мы уже разобрали
        // collections
//        ArrayList<Integer> nums = new ArrayList<>(); // empty
//        System.out.println(nums.isEmpty()); // check empty
//        nums.add(100); // add to the end O(1)
//        nums.add(50); // add to the end O(1)
//        nums.add(20); // add to the end O(1)
//        nums.add(0, 200); // O(N)
////        System.out.println(nums.get(4)); // возвращает элемент в коллекции O(1)
////        System.out.println(nums.size()); // O(1)
////        nums.remove(0); // O(N)
////        System.out.println(nums);
////        System.out.println(nums.get(0));
////        nums.forEach(System.out::println);
//        nums.set(0, 222); // O(1)
//        System.out.println(nums);
//        nums.removeIf(s -> s < 30);
//        System.out.println(nums);
//        boolean contains = nums.contains(100);
//        System.out.println(contains);
//        Collections.addAll(nums, 100, 6, 2, 500);
//        Collections.sort(nums);
//        System.out.println(nums);
        LinkedList<Integer> nums = new LinkedList<>(); // связный список
        long time = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            nums.add(0, i);
        }
        long end = System.currentTimeMillis();
        nums.add(50, 100000);
        System.out.println(end - time + " ms"); // 728 ms
        nums.remove(50);
        System.out.println(nums);
        /*
        Преимущества
        1. Удаляете по индексу
        2. Добавляете по индексу
        3. Добавляете в начало
        * */


    }
}
