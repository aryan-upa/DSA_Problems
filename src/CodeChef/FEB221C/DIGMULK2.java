package CodeChef.FEB221C;

import java.util.*;
import java.lang.*;

public class DIGMULK2 {

    public static int returnInt(char c) {
        return Integer.parseInt("" + c);
    }

    public static String doFun(String iniBalls, long numberOfBalls, long numberOfLevels, long[] mulVal, int[] numDig) {

        if(numberOfBalls == 1 && iniBalls.charAt(0) == '0')
            return "1";

        if (numberOfLevels > 0) {
            long newL = 0;
            String nstr = "";
            for (char c: iniBalls.toCharArray()) {
                int num = returnInt(c);
                newL += numDig[num];
                nstr += mulVal[num];
                if(newL > 100000007)
                    newL -= 100000007;
            }
            return doFun(nstr, newL, numberOfLevels-1, mulVal, numDig);
        }
        else {
            return "" + numberOfBalls;
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

            long[] mulVal = new long[10];
            for (int i = 0; i < 10; i++) {
                mulVal[i] = (int) (i*multiplierK);
            }

            int[] numDig = new int[10];
            for (int i = 0; i < 10; i++) {
                numDig[i] = String.valueOf(mulVal[i]).length();
            }

            String result = doFun(iniBalls, numberOfBalls, numberOfLevels, mulVal, numDig);
            System.out.println(result);
            T--;
        }
    }
}
