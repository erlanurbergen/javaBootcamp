package leetcode;

public class Main2 {
    public static void main(String[] args) {
        // 2011. Final Value of Variable After Performing Operations
        System.out.println(new Main2().finalValueAfterOperations(new String[]{"--X","X++","X++"}));
    }

    public int finalValueAfterOperations(String[] operations) {
        // Input: operations = ["--X","X++","X++"]
        //Output: 1
        //Explanation: The operations are performed as follows:
        //Initially, X = 0.
        //--X: X is decremented by 1, X =  0 - 1 = -1.
        //X++: X is incremented by 1, X = -1 + 1 =  0.
        //X++: X is incremented by 1, X =  0 + 1 =  1.
        int count = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].contains("++")){
                count++;
            } else
                count--;
        }
        return count;
    }
}
