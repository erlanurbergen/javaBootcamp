package leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main11 {
    // 5. Longest Palindromic Substring
    public static void main(String[] args) {
        System.out.println(new Main11().longestPalindrome("cmmrracelnclsbtdmuxtfiyahrvxuwreyorosyqapfpnsntommsujibzwhgugwtvxsdsltiiyymiofbslwbwevmjrsbbssicnxptvwmsmiifypoujftxylpyvirfueagprfyyydxeiftathaygmolkcwoaavmdmjsuwoibtuqoewaexihispsshwnsurjopdwttlzyqdbkypvjsbuidsdnpgklhwfnqdvlffcysnxeywvwvblatmxbflnuykhfhjptenhcxqinomlwalvlezefqybpuepbnymzlruuirpiatqgjgcnfmrlzshauoxuoqopcikogfwpssjdeplytcapmujyvgtfmmolnuadpwblgmcaututcrwsqrlpaaqobjfnhudmsulztbdkxpfejavastxejtpbqfftdtcdhvtpbzfuqcwkxtldtjycreimiujtxudtmokcoebhodbkgkgxjzrgyuqhozqtidltodlkziyofdeszwiobkwesdijxbbagguxvofvtphqxgvidqfkljufgubjmjllxoanbizwtedykwmneaosopynzlzvrlqcmyaahdcagfatlhwtgqxsyxwjhexfiplwtrtydjzrsysrcwszlntwrpgfedhgjzhztffqnjotlfudvczwfkhuwmdzcqgrmfttwaxocohtuscdxwfvhcymjpkqexusdaccw"));
    }
    public String longestPalindrome(String s) {
        // Input: s = "babad"
        // Output: "bab"
        int max = Integer.MIN_VALUE;
        ArrayList<String> data = new ArrayList<>();
        if (s.length() == 1)
            return s;
        if (s.equals(new StringBuilder(s).reverse().toString()))
            return s;
        for (int i = 0; i < s.length() ; i++) {
            for (int j = 0; j < s.length() - i; j++) {
                String check = s.substring(i, j + i + 1);
                StringBuilder res = new StringBuilder(check);
                    if (check.equals(res.reverse().toString())){
                        data.add(check);
                    }
            }
        }
        String fin = null;
        for (String datum : data) {
            if (datum.length() > max) {
                max = datum.length();
                fin = datum;
            }
        }


        return fin;
    }
}
