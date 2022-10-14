package resolveTechAssessment;

import java.util.ArrayList;
import java.util.List;

public class ResolveTechSolution {

    static List<String> al = new ArrayList<>();
    public static void main(String[] args) {
        String S = "abcd";
        int X = 3;

        // find all subsequences first
        subseq(S, "");

        // find score of all subsequences and put it in scores array
        int[] scores = new int[al.size()];
        int i  = 0;
        for (String val : al) {
            scores[i] = findscore(val);
            i++;
        }
        int ans = 0;
        for (int n : scores) {
            if (n != 0 && n % X == 0) ans++; // check multiple
        }

        System.out.println(ans);
       // return ans;
    }

    private static int findscore(String s) {
        int total = 0;
        for (char ch : s.toCharArray()) {
            int curr = (int) ch;
            total += curr;
        }
        return total;
    }

    private static void subseq(String s, String ans) {
        if (s.length() == 0) {
            al.add(ans);
            return;
        }
        subseq(s.substring(1), ans + s.charAt(0));
        subseq(s.substring(1), ans);
    }
}
