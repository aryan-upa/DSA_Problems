package LeetcodeContests.WC329;

public class AlternatingDigitSum {
    public int alternateDigitSum(int n) {
        char[] ch = String.valueOf(n).toCharArray();

        int sum = 0;
        int neg = 1;
        for (char c : ch) {
            sum += neg * (c - '0');
            neg *= -1;
        }

        return sum;
    }
}
