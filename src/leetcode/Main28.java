package leetcode;

public class Main28 {
    // 2678. Number of Senior Citizens

    public static void main(String[] args) {
        System.out.println(
                new Main28().countSeniors(new String[] {
                        "1313579440F2036", "2921522980M5644"
                })
        );
    }
    public int countSeniors(String[] details) {
        int index = 0;
        int count = 0;
        for (int i = 0; i < details.length; i++) {
            for (int j = 0; j < details[i].length(); j++) {
                if (Character.isAlphabetic(details[i].charAt(j))){
                    index = j;
                }
            }
            StringBuilder data = new StringBuilder();
            data.append(details[i].charAt(index + 1)).append(details[i].charAt(index + 2));

            if (Integer.parseInt(data.toString()) > 60) {
                count++;
            }

            index = 0;

        }

        return count;
    }
}
