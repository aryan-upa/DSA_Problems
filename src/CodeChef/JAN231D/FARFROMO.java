package CodeChef.JAN231D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.*;

public class FARFROMO {
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

	public static void main (String[] args) {
		FastReader sc = new FastReader();
		int T = sc.nextInt();

		while (T-- > 0) {
			int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
			double d1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
			double d2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));

			if (d1 == d2)
				System.out.println("EQUAL");
			if (d1 > d2)
				System.out.println("ALEX");
			else
				System.out.println("BOB");
		}
	}
}
