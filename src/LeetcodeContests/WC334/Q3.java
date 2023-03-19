package LeetcodeContests.WC334;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i ++)
            nums[i] = sc.nextInt();

        System.out.println(maxNumOfMarkedIndices(nums));
    }

    public static int maxNumOfMarkedIndices(int[] nums) {
        if (nums.length == 1)
            return 0;

        Arrays.sort(nums);

        int markCount = 0;
        int s = nums.length - 2;
        int e = nums.length - 1;

        int[] marked = new int[nums.length];

        while (s >= 0 && e >= 0) {
            if (marked[s] == 1) {
                s -= 1;
                continue;
            }

            while (e >= 0 && marked[e] != 1) {
                if (nums[e] >= 2 * nums[s]) {
                    marked[e] = 1;
                    marked[s] = 1;
                    markCount += 1;
                    break;
                }
                e -= 1;
            }

            e -= 1;
        }

        return markCount*2;
    }
}
