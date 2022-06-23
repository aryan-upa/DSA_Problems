package CollegeHackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
import java.lang.*;

public class DifferenceandNum {

    public static int[] takeInputArray(int n, Scanner sc) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        return arr;
    }

    public static void doFun() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = takeInputArray(n, sc);

        int num = sc.nextInt();
        int diff = sc.nextInt();

        boolean MinusOne = true;
        int count = 0;
        for (int ele :arr)
            if (Math.abs(num - ele) <= diff) {
                count++;
                MinusOne = false;
            }

        printResult(MinusOne, count);
    }

    public static void printResult(boolean MinusOne, int res) {
        if(!MinusOne)
            System.out.println(res);
        else
            System.out.println(-1);
    }

    public static void main(String[] args) {
        doFun();
    }
} 