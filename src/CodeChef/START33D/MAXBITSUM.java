// TLE
package CodeChef.START33D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.*;

public class MAXBITSUM {
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

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int T = sc.nextInt();
        while (T > 0) {
            int len = sc.nextInt();
            int[] a = new int[len];
            int[] b = new int[len];
            for (int i = 0; i < len; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < len; i++) {
                b[i] = sc.nextInt();
            }

            long totSum = 0;
            for (int i = 0; i < len; i++) {
                long currSum = 0;
                for (int j = 0; j < len; j++) {
                    currSum += Math.max(a[i]^b[j], a[i]&b[j]);
                }
                totSum += currSum;
            }

            System.out.println(totSum);

            T--;
        }
    }
} 