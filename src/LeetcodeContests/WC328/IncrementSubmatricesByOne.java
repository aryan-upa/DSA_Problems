package LeetcodeContests.WC328;

public class IncrementSubmatricesByOne {
	public int[][] rangeAddQueries(int n, int[][] queries) {
		int[][] mat = new int[n][n];

		for (int[] q : queries) {
			mat = update(mat, q);
		}

		return mat;
	}

	public int[][] update (int[][] mat, int[] q) {
		for (int i = q[0]; i <= q[2]; i ++) {
			for (int j = q[1]; j <= q[3]; j ++)
				mat[i][j] += 1;
		}

		return mat;
	}
}
