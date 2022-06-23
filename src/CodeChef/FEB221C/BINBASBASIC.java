package CodeChef.FEB221C;

import java.lang.*;
import java.util.*;

public class BINBASBASIC {

    public static int returnMisMatch(String s, int N) {
        int pos = 0;
        int checkPos = N;
        int notMatched = 0;
        int midVal = N/2;
        while(pos <= midVal) {
            checkPos = N - pos - 1;
            if(s.charAt(pos) != s.charAt(checkPos))
                notMatched++;
            pos++;
        }
        return notMatched;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            String s = sc.next();
            if(N > 1) {
                int notMatched = returnMisMatch(s, N);
                if(notMatched <= K) {
                    if(N%2==1)
                        System.out.println("YES");
                    else{
                        if((K - notMatched)%2==0)
                            System.out.println("YES");
                        else
                            System.out.println("NO");
                    }
                }
                else {
                    System.out.println("NO");
                }
            }
            else {
                if(K == 0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            T--;
        }
    }
}
