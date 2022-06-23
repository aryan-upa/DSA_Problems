package CodeChef.START31D;

// did after competition.
// bit manipulation.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.*;

public class XORAND {
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


    public static int returnMSB(int n) {
        if (n == 0)
            return 0;
        int msb = 0;
        n = n/2;
        while(n != 0) {
            n/=2;
            msb++;
        }
        return msb;
    }

    public static int[] createMSBarr(int[] arr) {
        int[] msbCount = new int[32];
        for (int i = 0; i < 32; i++) {
            msbCount[i] = 0;
        }

        for (int j : arr) {
            int msbPos = returnMSB(j);
            msbCount[msbPos]++;
        }

        return msbCount;
    }

    public static void doFun(FastReader sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        var msbArr = createMSBarr(arr);

        long res = 0;
        for (int val : msbArr) {
            res += ((long) val * (val - 1)) /2;
        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int T = sc.nextInt();
        while (T > 0) {
            doFun(sc);
            T--;
        }
    }
} 