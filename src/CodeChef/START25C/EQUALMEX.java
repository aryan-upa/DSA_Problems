// AC

package CodeChef.START25C;

import java.util.Scanner;

public class EQUALMEX {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0) {
            int numberOfElements = sc.nextInt();

            int[] res = new int[numberOfElements + 1];
            for (int i = 0; i < numberOfElements + 1; i++) {
                res[i] = 2;
            }

            int val = 0;
            for (int i = 0; i < 2*numberOfElements; i++) {
                val = sc.nextInt();
                if(res[val] != 0)
                    res[val]--;
            }

            boolean flag = false;
            for (int i = 0; i < res.length; i++) {
                if(res[i] == 1) {
                    flag = true;
                    break;
                }
                else if(res[i] == 2) {
                    break;
                }
            }

            if(flag)
                System.out.println("NO");
            else
                System.out.println("YES");

            T--;
        }
    }
}
