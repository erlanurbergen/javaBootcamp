package leetcode;

public class Main7 {
    public static void main(String[] args) {
        System.out.println(new Main7().restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3}));
    }

    public String restoreString(String s, int[] indices) {
        // Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
        // Output: "leetcode"
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < indices.length; i++) {
            res.append(s.charAt(indices[i]));
        }

        return res.toString();
    }
}
