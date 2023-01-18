package CodeChef.START74D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.*;

public class BAB_I {
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
			int[] nums = new int[n];

			for (int i = 0; i < n; i ++)
				nums[i] = sc.nextInt();

			long maxN = Integer.MIN_VALUE;
			long minP = Integer.MAX_VALUE;

			for (int val : nums) {
				if (val < 0 && val > maxN)
					maxN = val;
				if (val >= 0 && val < minP)
					minP = val;
			}

			System.out.println(Math.min(-maxN, minP) - 1);
        }
	}
}
