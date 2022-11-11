package CodeForces;

import java.lang.*;
import java.util.*;

public class Two_Groups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int num = sc.nextInt();
            long[] nums = new long[num];
            long sum = 0;

            for (int i = 0; i < num; i ++) {
                nums[i] = sc.nextLong();
                sum += nums[i];
            }

            System.out.println(Math.abs(sum));
        }
    }
}
