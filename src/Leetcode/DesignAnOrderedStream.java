package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class DesignAnOrderedStream {
    // Time: b/w [ 82ms - 209ms ] for exact same program.

    String[] os;
    int pointer = 0;

    public DesignAnOrderedStream(int n) {
        this.os = new String[n];
    }

    public List<String> insert(int idKey, String value) {
        int len = os.length, point = pointer;
        os[idKey-1] = value;

        List<String> toReturn = new ArrayList<>(len - pointer);

        while(point < len && os[point] != null)
            toReturn.add(os[point++]);

        pointer = point;
        return toReturn;
    }

}
