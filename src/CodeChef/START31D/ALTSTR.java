package CodeChef.START31D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.*;

public class ALTSTR {
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
            int N = sc.nextInt();
            String s = sc.next();
            int zCount = 0;
            int oCount = 0;
            for (var ele : s.toCharArray()) {
                if(ele == '1')
                    oCount++;
                else
                    zCount++;
            }

            if(oCount == zCount)
                System.out.println(2*oCount);
            else
                System.out.println(Math.min(oCount, zCount)*2 + 1);
            T--;
        }
    }
} 