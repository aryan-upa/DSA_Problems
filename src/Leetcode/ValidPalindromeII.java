package Leetcode;

public class ValidPalindromeII {

    public int isPalindrome(String s) {
        /*
        returns -1 if palindrome
        returns an index bw 0 and n/2 if not palindrome indicating the point of mismatch.
         */
        int len = s.length();
        for (int i = 0; i <= len/2; i++) {
            if(s.charAt(i) != s.charAt(len - i -1))
                return i;
        }
        return -1;
    }

    public boolean validPalindrome(String s) {
        int len = s.length();
        int res = isPalindrome(s);
        if(res == -1)
            return true;
        else {
            StringBuilder string1 = new StringBuilder(len - 1);
            StringBuilder string2 = new StringBuilder(len - 1);

            string1.append(s.substring(0, res));
            string1.append(s.substring(res+1));

            string2.append(s.substring(0,len - res));
            string2.append(s.substring(len - res + 1));

            return isPalindrome(string1.toString()) == -1 || isPalindrome(string2.toString()) == -1;
        }
    }

    public static void main(String[] args) {

    }
} 