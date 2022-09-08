package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tram {
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
        int noi = sc.nextInt();
        int[] in = new int[noi];
        int[] ex = new int[noi];

        for (int i = 0; i < noi; i++) {
            ex[i] = sc.nextInt();
            in[i] = sc.nextInt();
        }

        int maxAtOneMoment = Integer.MIN_VALUE;
        int curr = 0;
        for (int i = 0; i < noi; i++) {
            curr -= ex[i];
            curr += in[i];
            maxAtOneMoment = Math.max(curr, maxAtOneMoment);
        }

        System.out.println(maxAtOneMoment);
    }
}
