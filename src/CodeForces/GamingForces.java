package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.lang.*;

public class GamingForces {
    public static void main (String...args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int noe = sc.nextInt();

            int[] arr = new int[noe];
            for (int i = 0; i < noe; i ++)
                arr[i] = sc.nextInt();

            int ones = 0;
            for (int i = 0; i < noe; i ++) {
                if (arr[i] == 1) {
                    ones ++;
                    arr[i] = 0;
                }
            }

            int kill = 0;
            kill += ones/2 + ones%2;
            kill += (noe - ones);
            System.out.println(kill);
        }
    }
}
