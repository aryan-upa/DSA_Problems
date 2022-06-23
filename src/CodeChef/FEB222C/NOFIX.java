// AC

package CodeChef.FEB222C;

import java.util.*;
import java.lang.*;

public class NOFIX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0) {
            int L = sc.nextInt();
            int numberOfSteps = 0;
            for (int i = 1; i < L+numberOfSteps+1; i++) {
                int val = sc.nextInt();
                if(val == i) {
                    numberOfSteps++;
                    i++;
                }
            }
            System.out.println(numberOfSteps);
            T--;
        }
    }
}
