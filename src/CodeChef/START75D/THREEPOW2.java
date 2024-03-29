package CodeChef.START75D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.*;

public class THREEPOW2 {
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
			String s = sc.next();

			int[] count = new int[2];
			for (char c : s.toCharArray())
				count [c - '0'] += 1;

			if ((n == 1) || ((n == 2) && count[1] == 1) || count[1] > 3)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}
}
