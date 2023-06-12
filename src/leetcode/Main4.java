package leetcode;

public class Main4 {
    public static void main(String[] args) {
        System.out.println(new Main4().interpret("G()(al)"));
    }

    public String interpret(String command) {
        // Input: command = "G()(al)"
        //Output: "Goal"
        //Explanation: The Goal Parser interprets the command as follows:
        //G -> G
        //() -> o
        //(al) -> al
        //The final concatenated result is "Goal".
        String o = command.replace("()", "o");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < o.length(); i++) {
            if (o.charAt(i) == '(' || o.charAt(i) == ')')
                continue;
            else
                res.append(o.charAt(i));
        }
//        String replace = o.replace("(", "");
//        String replace1 = replace.replace(")", "");
        return res.toString();
    }
}
