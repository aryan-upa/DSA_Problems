package CodeChef.FEB221C;

import java.util.*;
import java.lang.*;

public class EUREKA {

    public static int doFun(int N) {
        double x = Math.pow(0.143 * N, N);
        double xFloor = Math.floor(x);
        if(x - xFloor < 0.5 )
            return (int) xFloor;
        else
            return (int) (xFloor + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(doFun(N));
            T--;
        }
    }
}
