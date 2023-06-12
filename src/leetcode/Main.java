package leetcode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1108. Defanging an IP Address
        System.out.println(new Main().defangIPaddr("1.1.1.1"));

    }

    public String defangIPaddr(String address) {
        StringBuilder res = new StringBuilder();
        // Input: address = "1.1.1.1"
        // Output: "1[.]1[.]1[.]1"

        // Input: address = "255.100.50.0"
        // Output: "255[.]100[.]50[.]0"
        String replace = address.replace(".", "[]");
        for (int i = 0; i < replace.length(); i++) {
            if (replace.charAt(i) == '[') {
                res.append("[");
                res.append(".");
            } else
                res.append(replace.charAt(i));
        }
        return res.toString();

    }
}
