package CodeStudio;

public class C704683 {
    public static void twoNonRepeatingElements(int[] arr, int n) {

        int totXor = 0, res1 = 0, res2 = 0;
        for (int i=0; i<n; i++)
            totXor ^= arr[i];
        int RSB = totXor & -totXor;
        for (int i=0; i<n; i++) {
            if ((arr[i] & RSB) != 0)
                res1 ^= arr[i];
            else
                res2 ^= arr[i];
        }

        System.out.print(Math.min(res1, res2) + " " + Math.max(res1, res2));
    }
}
