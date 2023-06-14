package leetcode;

public class Main23 {
    public static void main(String[] args) {
        System.out.println(new Main23().replaceDigits("a1c1e1"));
    }

    // 1844. Replace All Digits with Characters
    public String replaceDigits(String s) {
        // Input: s = "a1c1e1"
        //Output: "abcdef"
        //Explanation: The digits are replaced as follows:
        //- s[1] -> shift('a',1) = 'b'
        //- s[3] -> shift('c',1) = 'd'
        //- s[5] -> shift('e',1) = 'f'
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))){
                res.append(s.charAt(i));
            } else {
                int transfer = Character.getNumericValue(s.charAt(i));
                int prevValue = (int)s.charAt(i - 1) + transfer;
                res.append((char) prevValue);
            }
        }

        return res.toString();
    }
}
