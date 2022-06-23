package CodeStudio;

import java.util.ArrayList;

public class C1112602 {
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        boolean[] isPresent = new boolean[arr.size()];
        for(Integer num : arr) {
            if(isPresent[num])
                return num;
            isPresent[num] = true;
        }
        return 0; // Just a placeholder.
    }
}
