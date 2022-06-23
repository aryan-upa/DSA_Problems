// AC

package CodeChef.FEB222C;

import java.util.*;
import java.lang.*;

public class WCC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0) {
            long X = sc.nextInt();
            int CarlsonWon = 0;
            int ChefWon = 0;
            String GameResults = sc.next();
            for (char result : GameResults.toCharArray()) {
                if(result == 'C')
                    CarlsonWon += 2;
                else if(result == 'D') {
                    CarlsonWon++;
                    ChefWon++;
                }
                else {
                    ChefWon += 2;
                }
            }

            boolean isItTie = (CarlsonWon == ChefWon);
            if(isItTie) {
                System.out.println(55*X);
            }
            else {
                boolean isCarlsonWinner = (CarlsonWon > ChefWon);
                if(isCarlsonWinner)
                    System.out.println(60*X);
                else
                    System.out.println(40*X);
            }

            T--;
        }
    }
}
