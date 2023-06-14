package codewars;

public class Main {
    // https://www.codewars.com/kata/54a91a4883a7de5d7800009c/train/java

    // foo -> foo1
    //
    //foobar23 -> foobar24
    //
    //foo0042 -> foo0043
    //
    //foo9 -> foo10
    //
    //foo099 -> foo100
    public static void main(String[] args) {
//        int a = 003;
//        int b = Integer.parseInt(Integer.toString(a,8));
//        System.out.println(b);
        System.out.println(incrementString("foo3"));
    }
    public static String incrementString(String str) {
        StringBuilder res = new StringBuilder();
        StringBuilder alpha = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                res.append(str.charAt(i));
            } else
                alpha.append(str.charAt(i));
        }

        // 1 case
        if (res.toString().isEmpty()) {
            res.append(str + "1");
            return res.toString();
        }

        // 2 case
        int a = Integer.parseInt(res.toString(), 8) + 1;
//        System.out.println("a " + (a + 1));

        return alpha.toString() + a;
    }
}
