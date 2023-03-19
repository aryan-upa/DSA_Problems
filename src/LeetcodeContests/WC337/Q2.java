package LeetcodeContests.WC337;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.*;

public class Q2 {
	public boolean checkValidGrid(int[][] grid) {
		return checkValidGridHelper(grid, 0, 0, 0);
	}

	int[][] possibleMoves = new int[][] {
			{2, 1}, {2, -1}, {-2, 1}, {-2, -1}, {1, 2}, {-1, 2}, {1, -2}, {-1, -2}
	};

	public boolean checkValidGridHelper (int[][] grid, int row, int col, int idx) {
		if (idx == grid.length * grid.length - 1)
			return true;

		for (int[] move : possibleMoves) {
			if (row + move[0] >= 0 && row + move[0] < grid.length &&
					col + move[1] >= 0 && col + move[1] < grid.length &&
					grid[row + move[0]][col + move[1]] == idx + 1)
				return checkValidGridHelper(grid, row + move[0], col + move[1], idx + 1);
		}

		return false;
	}
}
