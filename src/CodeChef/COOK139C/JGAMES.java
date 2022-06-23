package CodeChef.COOK139C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.*;

public class JGAMES {
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

    public static void main(String... args) {
        FastReader sc = new FastReader();
        int T = sc.nextInt();
        while (T > 0) {
            int X, Y;
            X = sc.nextInt();
            Y = sc.nextInt();

            boolean isJayWinner = false;

            if(((X+Y)&1) == 1)
                isJayWinner = true;


            if(isJayWinner)
                System.out.println("Jay");
            else
                System.out.println("Janmansh");

            T--;
        }
    }
}