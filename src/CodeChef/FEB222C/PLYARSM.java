// Not even understood shit.

package CodeChef.FEB222C;

import java.util.*;
import java.lang.*;

public class PLYARSM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0) {
            int N = sc.nextInt();
            long[] arr = new long[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            boolean sorted = true;
            for (int i = 0; i < N - 1; i++) {
                if(arr[i] > arr[i+1]) {
                    sorted = false;
                    break;
                }
            }

            if(sorted)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
