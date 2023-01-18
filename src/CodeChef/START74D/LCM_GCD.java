package CodeChef.START74D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.lang.*;

public class LCM_GCD {
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

			ArrayList<Integer> primeOfA = primeFactors(a);
			ArrayList<Integer> primeOfB = primeFactors(b);
			ArrayList<Integer> res = new ArrayList<>();

			res.add(1);
			int pos1 = 0;
			int pos2 = 0;

			while (pos1 < primeOfA.size() && pos2 < primeOfB.size()) {
				if (primeOfA.get(pos1).equals(primeOfB.get(pos2))) {
					if (!primeOfA.get(pos1).equals(res.get(res.size() - 1)))
						res.add(primeOfA.get(pos1));
					pos1++;
					pos2++;
				} else if (primeOfA.get(pos1) < primeOfB.get(pos2))
					pos1++;
				else
					pos2++;
			}

			int value = 1;
			for (int val : res)
				value *= val;

			if (value == 1)
				System.out.println(a - 1);
			else
				System.out.println(a - value);
		}
	}

	public static ArrayList<Integer> primeFactors(int n) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);

		if (n <= 1)
			return list;

		for (int i = 2; i * i <= n; i++) {
			while(n % i == 0) {
				list.add(i);
				n /= i;
			}
		}

		if(n > 1)
			list.add(n);

		return list;
	}

//	static int gcd(int a, int b) {
//		if (b == 0)
//			return a;
//		return gcd(b, a%b);
//	}
//
//	static int lcm(int a, int b) {
//		return (a * b) / gcd(a, b);
//	}
}

/*
3
12 15
5 50
9 11


*/
