// link: https://leetcode.com/problems/get-the-maximum-score/

package Leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
import java.lang.*;

public class MaxSum {

    // A really naive approach, but anyhow did the job.
    static class Pair<T, V> {
        T first;
        V second;
    }

    public static Pair<ArrayList<Integer>, ArrayList<Integer>> returnSumsArray(int[] checkFrom, int[] checkIn,
                                                                               int l1, int l2) {
        int maxEl = Math.max(checkFrom[l1-1], checkIn[l2-1]);

        int[] fillArr1 = new int[maxEl+1];
        int[] fillArr2 = new int[maxEl+1];

        int c1= 0;
        int c2= 0;
        for (int i = 0; i <= maxEl; i++) {
            if(c1 < l1)
                if(checkFrom[c1] == i) {
                    fillArr1[i] = i;
                    c1++;
                }
                else
                    fillArr1[i] = 0;

            if(c2 < l2)
                if(checkIn[c2] == i) {
                    fillArr2[i] = i;
                    c2++;
                }
                else
                    fillArr2[i] = 0;
        }

        int recentSum1 = 0;
        int recentSum2 = 0;

        ArrayList<Integer> sums1 = new ArrayList<>();
        ArrayList<Integer> sums2 = new ArrayList<>();

        for (int i = 0; i <= maxEl; i++) {
            if(fillArr1[i] == fillArr2[i] && fillArr1[i] != 0) {
                sums1.add(recentSum1);
                sums2.add(recentSum2);

                sums1.add(i);
                sums2.add(i);

                recentSum1 = 0;
                recentSum2 = 0;
            }
            else {
                recentSum1 += fillArr1[i];
                recentSum2 += fillArr2[i];
            }
            if(recentSum1 >= 1000000007 || recentSum2 >= 1000000007) {
                sums1.add(recentSum1);
                sums2.add(recentSum2);
                recentSum1 = 0;
                recentSum2 = 0;
            }
        }

        sums1.add(recentSum1);
        sums2.add(recentSum2);

        Pair<ArrayList<Integer>, ArrayList<Integer>> output = new Pair<>();
        output.first = sums1;
        output.second = sums2;

        return output;
    }

    public static int maxSum(int[] nums1, int[] nums2) {
        int l1 = nums1.length, l2 = nums2.length;

        var res = returnSumsArray(nums1, nums2, l1, l2);
        var list1 = res.first;
        var list2 = res.second;

        int i = 0;
        long sum = 0;
        for (int ele : list1) {
            sum += Math.max(ele, list2.get(i));
            sum%=1000000007;
            i++;
        }

        return (int) sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int[] nums1 = new int[l1];
        for (int i = 0; i < l1; i++)
            nums1[i] = sc.nextInt();
        int l2 = sc.nextInt();
        int[] nums2 = new int[l2];
        for (int i = 0; i < l2; i++)
            nums2[i] = sc.nextInt();

        System.out.println(maxSum(nums1, nums2));
    }
}

/*
T1 :
5
2 4 5 8 10
4
4 6 8 9

T2 :
5
1 3 5 7 9
3
3 5 100

T3 :
5
1 2 3 4 5
5
6 7 8 9 10

T4 :
5
1 2 3 4 5
1
10

T5 :
5
1 2 3 4 5
2
5 10

T6 :
5
1 2 3 4 5
2
1 10

T7 :
1
1
1
1

T8 :
5
1 2 3 4 5
4
2 3 4 6

T9 :
5
1 2 3 4 5
3
2 3 4

T10 :
4
2 3 4 5
3
1 3 16

 */