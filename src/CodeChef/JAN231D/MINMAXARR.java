package CodeChef.JAN231D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.lang.*;

public class MINMAXARR {
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

			for (int i = 0; i < n; i ++) nums[i] = sc.nextInt();
			int sum = 0;

			for (int val : nums) sum += val;

			int avg = (sum + n - 1) / n;
			int max = avg;
			int extra = 0;

			for (int j = nums.length - 1; j >= 0; j --) {
				if (nums[j] > avg) {
					nums[j] = avg;
					extra = nums[j] - avg;
				}

				sum = sum - nums[j] + extra;
				extra = 0;
				if (j!=0) avg = (sum + j - 1) / j;
				if (avg > max)
					max = avg;
			}

			System.out.println(max);
		}
	}
}

/*
3
4
1 5 7 6
3
5 15 19
4
10 3 5 7
 */