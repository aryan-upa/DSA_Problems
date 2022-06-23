package CodeChef.START31D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.*;

public class ECOCLASS {
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
            int N;
            N = sc.nextInt();
            int[] S = new int[N];
            int[] D = new int[N];

            for (int i = 0; i < N; i++)
                S[i] = sc.nextInt();
            for (int i = 0; i < N; i++)
                D[i] = sc.nextInt();

            int count = 0;
            for (int i = 0; i < N; i++) {
                if(D[i] - S[i] == 0)
                    count++;
            }

            System.out.println(count);
            T--;
        }
    }
} 