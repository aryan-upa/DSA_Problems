package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.lang.*;

public class Puzzels {
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
        int n = sc.nextInt(), m = sc.nextInt();
        int[] sizes = new int[m];

        for (int i = 0; i < m; i++) {
            sizes[i] = sc.nextInt();
        }

        Arrays.sort(sizes);

        int minDiff = Integer.MAX_VALUE;
        int i;
        for (i = 0; i < m - n; i ++)
            minDiff = Math.min(minDiff, sizes[i+n - 1] - sizes[i]);

        minDiff = Math.min(minDiff, sizes[i + n - 1] - sizes[i]);
        System.out.println(minDiff);
    }
}
