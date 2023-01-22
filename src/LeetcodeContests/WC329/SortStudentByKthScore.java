package LeetcodeContests.WC329;

public class SortStudentByKthScore {
    public int[][] sortTheStudents(int[][] score, int k) {
        int numOfStudent = score.length, numOfScores = score[0].length;
        for (int i = 1; i < numOfStudent; i ++) {
            int[] student = score[i];
            int kSc = score[i][k];
            int j = i - 1;
            while (j >= 0 && score[j][k] < kSc) {
                score[j+1] = score[j];
                j --;
            }
            score[j+1] = student;
        }
        return score;
    }
}
