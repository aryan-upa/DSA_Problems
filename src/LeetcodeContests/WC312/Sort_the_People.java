package LeetcodeContests.WC312;

import java.util.*;

public class Sort_the_People {
	public String[] sortPeople(String[] names, int[] heights) {
		Map<Integer, String> map = new HashMap<>();
		for (int i = 0; i < names.length; i++) {
			map.put(heights[i], names[i]);
		}
		TreeMap<Integer, String> sorted = new TreeMap<>(map);
		String[] res = new String[names.length];

		int pos = 0, len = names.length;
		for (String s : sorted.values())
			res[len - pos  -1] = s;

		return res;
	}
}
