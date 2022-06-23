package CodeChef.START33D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.*;
import java.util.function.Function;

public class DISTDILEM {
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
            int sum = 0;
//            int curr;
            for (int i = 0; i < len; i++) {
//                curr = sc.nextInt();
                sum += sc.nextInt();
            }
            int n = 0;
            while(true) {
                if(nSum.apply(++n) >= sum)
                    break;
            }
            System.out.println(nSum.apply(n) == sum ? n : --n);
            T--;
        }
    }

    static Function<Integer, Integer> nSum = n -> n*(n+1)/2;

} 