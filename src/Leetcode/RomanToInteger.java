package Leetcode;

public class RomanToInteger {
    static final int I = 1;
    static final int V = 5;
    static final int X = 10;
    static final int L = 50;
    static final int C = 100;
    static final int D = 500;
    static final int M = 1000;

    public static int getValue(char c) {
        switch (c) {
            case 'I' : return I;
            case 'V' : return V;
            case 'X' : return X;
            case 'L' : return L;
            case 'C' : return C;
            case 'D' : return D;
            case 'M' : return M;
            default : return 0;
        }
    }

    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int res = 0;

        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 1 && getValue(chars[i]) < getValue(chars[i+1])) {
                res = res + getValue(chars[i+1]) - getValue(chars[i]);
                i++;
            }
            else
                res += getValue(chars[i]);
        }

        return res;
    }

}
