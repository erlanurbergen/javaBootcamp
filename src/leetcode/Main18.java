package leetcode;

public class Main18 {
    public static void main(String[] args) {
//        System.out.println(new Main18().isPalindrome("0P"));
        System.out.println(incrementString("foo00420"));

    }

    public boolean isPalindrome(String s) {
        // 97 122
        // 48 57
        String s1 = s.toLowerCase();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if ((s1.charAt(i) >= 97 && s1.charAt(i) <= 122) || (s1.charAt(i) >= 48 && s1.charAt(i) <= 57)) {
                res.append(s1.charAt(i));
            }
        }
        System.out.println(res);
        return res.toString().equals(res.reverse().toString());


//        String text = "";
//        for(int i = 0; i < s.length(); i++){
//            if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i)))
//                text += s.charAt(i);
//        }
//
//        StringBuilder t1 = new StringBuilder(text);
//        String s1 = t1.reverse().toString().toLowerCase();
//
//        if(text.toLowerCase().equals(s1))
//            return true;


    }

    public static String incrementString(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                res.append(str.charAt(i));
            }
        }

        if (res.toString().isEmpty()) {
            res.append(str + "1");
            return res.toString();
        }
        int index = 0;
        while (res.toString().charAt(index) == '0') {
            //
        }
        return "dsds";

        // foo -> foo1
        //
        //foobar23 -> foobar24
        //
        //foo0042 -> foo0043
        //
        //foo9 -> foo10
        //
        //foo099 -> foo100

    }
}
