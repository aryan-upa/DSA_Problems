// AC

package CodeChef.START25C;

import java.util.*;
import java.lang.*;

public class DATATYPE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases > 0) {
            int maximumRange = sc.nextInt();
            int numberEntered = sc.nextInt();

            while (numberEntered > maximumRange) {
                numberEntered -= maximumRange + 1;
            }
            System.out.println(numberEntered);

            testCases--;
        }
    }
}
