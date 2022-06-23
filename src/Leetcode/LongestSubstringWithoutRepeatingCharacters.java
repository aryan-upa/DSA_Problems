package Leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
import java.lang.*;

public class LongestSubstringWithoutRepeatingCharacters {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void initializeToZero(int[] arr, int len) {
        for (int i = 0; i < len; i++)
            arr[i] = 0;
    }

    public static boolean shouldBreak(int[] arr, char c) {
        if(arr[(int) c] == 0)
            arr[(int) c]++;
        else
            return true;
        return false;
    }

    public static int findStartAndEnd(String s) {
        int start = 0;
        int end = 0;

        char[] arr = s.toCharArray();
        int[] alphabetCountInString = new int[256];
        initializeToZero(alphabetCountInString, 256);

        int maxLen = 0;
        int len = 0;
        int curr;
        for (curr = 0; curr < arr.length; curr++) {
            if(shouldBreak(alphabetCountInString, arr[curr])) {
                if(len > maxLen) {
                    maxLen = len;
                    start = curr - len;
                    end = curr;
                }
                initializeToZero(alphabetCountInString, 256);
                shouldBreak(alphabetCountInString, arr[curr]);
                len = 1;
            }
            else
                len++;
        }

        if(len > maxLen) {
            start = curr - len;
            end = curr;
        }

        return end - start;
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int T = sc.nextInt();
        while (T > 0) {
            String s = sc.next();
            int res = findStartAndEnd(s);
            System.out.println(res);
            T--;
        }
    }
}

// dvdf -> 2
// but answer is 3.