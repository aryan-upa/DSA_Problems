// Not AC

package CodeChef.MARCH222D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.*;

public class MISS_NUM {
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

    public static void takeInputArray(long[] arr, int len, FastReader sc) {
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextLong();
        }
    }

    static long[][] permuations = new long[24][4];
    static int count = 0;

    public static void permute(long[] arr, int index){
        if(index >= arr.length - 1) {
            for(int i = 0; i < arr.length; i++){
                permuations[count][i] = arr[i];
            }
            count++;
            return;
        }

        for(int i = index; i < arr.length; i++) {
            long t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;

            permute(arr, index+1);

            t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int T = sc.nextInt();
        while (T > 0) {
            long a = -1, b = -1;
            long[] arr = new long[4];

            takeInputArray(arr,4,sc);
            int totalPermutations = 24;
            boolean foundValues = false;
            permute(arr, 0);
            int i=0;

            while (totalPermutations > 0) {
                long[] tempArr = permuations[i];

                long A = tempArr[0]; // Supposedly Addition
                long B = tempArr[1]; // Supposedly Subtraction
                long C = tempArr[2]; // Supposedly Multiplication
                long D = tempArr[3]; // Supposedly Integer Division.

                if( (A*A - B*B) == 4*C) {
                    double tempA = (double) (A+B)/2;
                    double tempB = (double) (A-B)/2;

                    a = (A+B)/2;
                    b = (A-B)/2;

                    if(a == Math.floor(tempA) && b == Math.floor(tempB)) {
                        if ((a > 0 && a <= 10000) && (b > 0 && b <= 10000)) {
                            if (a/b == D && a * b == C) {
                                if(foundValues) {
                                    foundValues = false;
                                    break;
                                }
                                else
                                    foundValues = true;
                            }
                        }
                    }
                }
                i++;
                totalPermutations--;
            }

            if(!foundValues)
                System.out.println("-1 -1");
            else {
                if(a>b) {
                    a = a^b;
                    b = a^b;
                    a = a^b;
                }
                System.out.println(a + " " + b);
            }

            permuations = new long[24][4];
            count = 0;
            T--;
        }
    }
}

