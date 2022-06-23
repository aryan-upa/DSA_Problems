package CodeChef.FEB221C;

import java.util.*;
import java.lang.*;

public class DIGMULK {

    public static int returnInt(char c) {
        return Integer.parseInt("" + c);
    }

    public static String doFun(String s, long numberOfLevels, long multiplierK) {
        if(s.length() == 1 && returnInt(s.charAt(0)) == 0)
            return "0" + '\0';
        if(numberOfLevels == 0) {
            return s + "\0";
        }
        else {
            String nstr = "";
            for (char eachBall: s.toCharArray()) {
                long val = (long) multiplierK * returnInt(eachBall);
                nstr += String.valueOf(val);
            }
            return doFun(nstr, numberOfLevels-1, multiplierK);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0) {
            int numberOfBalls = sc.nextInt();
            long multiplierK = sc.nextInt();
            long numberOfLevels = sc.nextInt();
            String iniBalls = sc.next();
            String result = doFun(iniBalls, numberOfLevels, multiplierK);
            long count = 0;
            for (int i = 0; result.charAt(i) != '\0'; i++) {
                count++;
                if(count > 100000007)
                    count = count % 100000007;
            }
            System.out.println(count);
            T--;
        }
    }
}
