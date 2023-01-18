package CodeChef.JAN231D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.lang.*;

public class NEGPROD {
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
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
			if (a*b < 0 || a*c < 0 || b*c < 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
