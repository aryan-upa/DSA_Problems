package CodeChef.START74D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.*;

public class FACEBOOK {
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
			int n = sc.nextInt();

			int[] likes = new int[n];
			int[] comm = new int[n];

			for (int i = 0; i < n; i ++)
				likes[i] = sc.nextInt();

			for (int i = 0; i < n; i ++)
				comm[i] = sc.nextInt();

			int ind = 0;
			int maxL = likes[0];
			int maxC = comm[0];

			for (int i = 1; i < n; i ++) {
				if (likes[i] > maxL) {
					ind = i;
					maxL = likes[i];
					maxC = comm[i];
				} else if (likes[i] == maxL) {
					if (comm[i] > maxC) {
						ind = i;
						maxC = comm[i];
					}
				}
			}

			System.out.println(ind + 1);
		}
	}
}
