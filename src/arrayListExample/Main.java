package arrayListExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("sam");
        names.add("mike");

        Collections.addAll(names, "nina", "makpal");
        names.set(0, "Arman");
        names.add(0, "Erlan");
//        System.out.println(names);
        System.out.println(names.get(0));

    }
}
