package LeetcodeContests.WC314;

public class TheEmployeeThatWorkedontheLongestTask {
    public int hardestWorker(int n, int[][] logs) {
        for (int i = logs.length - 1; i > 0; i --)
            logs[i][1] = logs[i][1] - logs[i-1][1];

        int maxTime = logs[0][1], maxID = logs[0][0];

        for (int[] log : logs) {
            if (log[1] > maxTime) {
                maxID = log[0];
                maxTime = log[1];
            }
            else if (log[1] == maxTime)
                maxID = Math.min(log[0], maxID);
        }

        return maxID;
    }
}
