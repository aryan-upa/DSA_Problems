// couldn't submit
package LeetcodeContests.WC310;

import java.util.HashSet;

public class DivideIntervalsIntoMinimumNumberOfGroups {
    public int minGroups(int[][] il) {
        int groupCount = 1;

        HashSet<Integer> set = new HashSet<>();

        set.add(il[0][0]);
        set.add(il[0][1]);

        for (int i = 1; i < il.length; i ++) {
            int val1 = il[i][0];
            int val2 = il[i][1];

            if (!set.contains(val1) && !set.contains(val2))
                groupCount++;

            else {
                set = new HashSet<>();
                set.add(val1);
                set.add(val2);
            }
        }

        return groupCount;
    }
}
