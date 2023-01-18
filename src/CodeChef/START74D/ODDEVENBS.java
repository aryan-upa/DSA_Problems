package CodeChef.START74D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.lang.*;

public class ODDEVENBS {
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

        while (T-- > 0) {
			int n = sc.nextInt();
			int[] parity = new int[n];

			for (int i = 0; i < n; i ++)
				parity[i] = sc.nextInt();

			int oneCount = 0;
			int zeroCount = 0;

			for (int val : parity) {
			    if (val == 0) zeroCount += 1;
				else oneCount += 1;
			}

			System.out.println((n - oneCount) % 2 == 0 ? "Yes" : "No");
		}
	}
}
/*

3
4
0 1 0 1
5
1 1 1 1 0
6
1 1 1 1 1 1


*/