// AC

package CodeChef.FEB222C;

import java.util.*;
import java.lang.*;

public class HELIUM3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A,B,C,D;
            A = sc.nextInt();
            B = sc.nextInt();
            C = sc.nextInt();
            D = sc.nextInt();

            if( A*B <= C*D) {
                System.out.println("YES");
            }
            else
                System.out.println("NO");

            T--;
        }
    }
}
