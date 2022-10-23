package LeetcodeContests.WC316;

public class DetermineifTwoEventsHaveConflict {
    public boolean haveConflict(String[] event1, String[] event2) {
        int[] e1 = new int[2];
        int[] e2 = new int[2];

        for (int i = 0; i < event1.length; i++) {
            event1[i] = event1[i].replace(":", "");
            e1[i] = Integer.parseInt(event1[i]);
        }

        for (int i = 0; i < event1.length; i++) {
            event2[i] = event2[i].replace(":", "");
            e2[i] = Integer.parseInt(event2[i]);
        }

        if (e1[0] > e2[0]) {
            int[] temp;
            temp = e1;
            e1 = e2;
            e2 = temp;
        }

        return e2[0] < e1[1];
    }
}
