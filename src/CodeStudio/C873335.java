package CodeStudio;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C873335 {

    public static int sumInRangesHelper(int[] arr, int n, List<Long> query) {
        Long L = query.get(0);
        Long R = query.get(1) + 1L;

        BigInteger arrSum = BigInteger.valueOf(Arrays.stream(arr).sum());

        BigInteger leftSum = BigInteger.valueOf(0);
        for (int i = 0; i < Math.min(n - L, R - L); i++) {
            leftSum = leftSum.add(BigInteger.valueOf(arr[(int) (L + i - 1)]));
        }

        long completeArrayTimes = (R - L - 1L) / n;
        BigInteger completeArrTimesSum = arrSum.multiply(BigInteger.valueOf(completeArrayTimes));

        BigInteger rightSum = BigInteger.valueOf(0);
        Long rightElements = (R - L - 1L) % n;
        for (int i = 0; i < rightElements; i++) {
            rightSum = rightSum.add(BigInteger.valueOf(arr[i]));
        }

        BigInteger totalSumWithModulo = rightSum.add(completeArrTimesSum).add(leftSum).mod(BigInteger.valueOf(1000000007L));

        return Integer.parseInt(totalSumWithModulo.toString());
    }

    public static List<Integer> sumInRanges(int[] arr, int n, List<List<Long>> queries, int q) {
        List<Integer> result = new ArrayList<>();

        for (List<Long> query : queries) {
            result.add(sumInRangesHelper(arr, n, query));
        }

        return result;
    }
}

/*
    7
        1
            10
        4
            1 1
            7 7
            3 5
            1 2

        2
            11 11
        5
            1 2
            1 3
            2 3
            2 4
            1 10

        3
            12 14 53
        2
            1 5
            4 8

        4
            5 5 55 5
        1
            1 11

        5
            98 7 985 65 5
        3
            1 3
            1 33
            4 6

        6
            1 20 2 6 81 2
        2
            7 12
            6 11

        7
            98 65 32 2 32 4 7
        1
            1 7
 */
