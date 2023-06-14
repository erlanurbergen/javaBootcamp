package leetcode;

public class Main26 {
    public static void main(String[] args) {
        System.out.println(new Main26().removeTrailingZeros("51230100"));
    }

    // 2710. Remove Trailing Zeros From a String
    public String removeTrailingZeros(String num) {
        // Input: num = "51230100"
        // Output: "512301"
        String res = new StringBuilder(num).reverse().toString();
        StringBuilder data = new StringBuilder();
        int index = 0;
        for (int i = 0; i < res.length(); i++) {
            if (res.charAt(i) != '0') {
                index = i;
                break;
            }
        }

        for (int i = index; i < res.length(); i++) {
            data.append(res.charAt(i));
        }

        return data.reverse().toString();
    }
}
