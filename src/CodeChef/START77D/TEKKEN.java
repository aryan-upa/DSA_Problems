package CodeChef.START77D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.*;

public class TEKKEN {
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
			int mbc = Math.min(b, c);
			b -= mbc;
			c -= mbc;

			if (b < c) {
				int mab = Math.min(a, b);
				a -= mab;
				b -= mab;

				int mac = Math.min(a, c);
				a -= mac;
				b -= mac;
			} else {
				int mac = Math.min(a, c);
				a -= mac;
				c -= mac;

				int mab = Math.min(a, b);
				a -= mab;
				b -= mab;
			}

			System.out.println(a == 0 ? "No" : "Yes");
		}
	}
}
