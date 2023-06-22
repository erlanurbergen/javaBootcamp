package leetcode;

public class Main45 {
    public static void main(String[] args) {
        System.out.println(new Main45().replaceDigits("a1c1e1"));
    }

    public String replaceDigits(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))){
                res.append(s.charAt(i));
                // 97 122
            } else {
                int transfer = Character.getNumericValue(s.charAt(i));
                System.out.println("transfer " + transfer);
                int prevValue = (int)s.charAt(i - 1) + transfer;
                System.out.println("prevValue " + prevValue);
                res.append((char) prevValue);
            }
        }

        return res.toString();
    }
}
