package CodeChef.START75D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.*;

public class PREFONES {
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

			if (s.charAt(0) == '1') {
				int idx = 0;
				for (int i = 0; i < n; i ++) {
					if (s.charAt(i) == '1')
						idx += 1;
					else
						break;
				}

				if (idx == n)
					System.out.println(n);
				else
					System.out.println(idx + findPreOnes(s.substring(idx)));
			} else {
				System.out.println(findPreOnes(s));
			}
		}
	}

	public static int findPreOnes(String s) {
		boolean isOneFound = false;
		int currLen = 0;
		int maxLen = 0;

		for (int i = 0; i < s.length(); i ++) {
			if (s.charAt(i) == '1') {
				currLen += 1;
				isOneFound = true;
			}

			else {
				if (currLen > maxLen) {
					maxLen = currLen;
				}
				currLen = 0;
			}
		}

		if (currLen > maxLen) {
			maxLen = currLen;
		}

		return !isOneFound ? 0 : maxLen;
	}
}
