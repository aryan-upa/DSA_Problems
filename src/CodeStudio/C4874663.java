package CodeStudio;

public class C4874663 {
    static int locking(int numberOfNodes, int target, int[] parentArr, int[] lockedArr) {

        int currIndex = target;
        boolean isLocked = false;
        while(currIndex != 0 && !isLocked ) {
            if(lockedArr[currIndex] == 1)
                isLocked = true;
            currIndex = parentArr[currIndex];
        }

        if(isLocked)
            return 1;
        else
            return 0;
    }
}
