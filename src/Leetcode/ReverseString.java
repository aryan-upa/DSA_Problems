package Leetcode;

public class ReverseString {

    public void reverseString(char[] s) {
        int len = s.length;
        for (int i = len-1; i >=len/2 ; i--) {
            char temp = s[i];
            s[i] = s[len - i - 1];
            s[len - i - 1] = temp;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        obj.reverseString(new char[]{'a','b'});
    }
} 