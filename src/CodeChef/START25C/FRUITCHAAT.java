// AC

package CodeChef.START25C;

import java.util.*;
import java.lang.*;

public class FRUITCHAAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TestCases = sc.nextInt();
        while(TestCases > 0) {

            int X = sc.nextInt();
            int Y = sc.nextInt();

            int numberOfChatsByX = X/2;
            int numberOfChatsByY = Y;

            if(numberOfChatsByX > numberOfChatsByY) {
                System.out.println(Y);
            }
            else
                System.out.println(X/2);

            TestCases--;
        }
    }
}
