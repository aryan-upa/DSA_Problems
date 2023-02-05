package LeetcodeContests.WC331;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.lang.*;

public class TakeGifts {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Long> giftsQueue = new PriorityQueue<>(gifts.length, Comparator.comparingLong((x) -> (long) -x));

        long tot = 0;
        for (long gift : gifts) {
            giftsQueue.offer(gift);
            tot += gift;
        }

        long giftsOut = 0;
        while (k -- > 0 && !giftsQueue.isEmpty()) {
            long maxGift = giftsQueue.poll();
            giftsOut += maxGift - Math.floor(Math.sqrt(maxGift));
            giftsQueue.offer((long) Math.floor(Math.sqrt(maxGift)));
        }

        return tot - giftsOut;
    }
}
