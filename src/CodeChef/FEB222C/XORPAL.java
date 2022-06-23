// AC

package CodeChef.FEB222C;

import java.util.*;
import java.lang.*;

public class XORPAL {

    public static int digVal(char c) {
        return c - '0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0) {
            int length = sc.nextInt();
            String binString = sc.next();
            int zeroCount = 0;
            int oneCount = 0;
            for (char c: binString.toCharArray()) {
                if(digVal(c) == 1)
                    oneCount++;
                else
                    zeroCount++;
            }

            boolean isXORPalindrome;
            if(length%2==0) {
                if (length == 2) {
                   isXORPalindrome = true;
                }
                else {
                    if(oneCount % 2 == 0) {
                        isXORPalindrome = true;
                    }
                    else
                        isXORPalindrome = oneCount == zeroCount;
                    // 0000011111 is the last case.
                }
            }
            else {
                int val = 0;
                val += oneCount % 2;
                val += zeroCount % 2;
                isXORPalindrome = val % 2 != 0;
            }

            if(isXORPalindrome)
                System.out.println("YES");
            else
                System.out.println("NO");

            T--;
        }
    }
}
