package CodeChef.START75D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.*;

public class TWORANGES {
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
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();

			if (c > a) {
				if (c > b) {
					System.out.println((b-a+1) + (d-c+1));
				} else {
					if (d > b)
						System.out.println(d-a+1);
					else
						System.out.println(b-a+1);
				}
			} else {
				if (a > d) {
					System.out.println((b-a+1) + (d-c+1));
				} else {
					if (b > d)
						System.out.println(b-c+1);
					else
						System.out.println(d-c+1);
				}
			}
		}
	}
}
