package LeetcodeContests.WC311;

import java.util.Scanner;

public class Length_of_the_Longest_Alphabetical_Continuous_Substring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println(new Length_of_the_Longest_Alphabetical_Continuous_Substring().longestContinuousSubstring(sc.next()));
		}
	}

	public int longestContinuousSubstring(String s) {
		int max = 1;
		int start = 0;
		int end = 1;

		int len = s.length();
		char[] c = s.toCharArray();

		while (end < len) {
			if (c[end] == (c[end-1] + 1))
				end ++;

			else {
				max = Math.max(max, end - start);
				start = end;
				end = start + 1;
			}
		}

		max = Math.max(max, end - start);

		return max;
	}
}
