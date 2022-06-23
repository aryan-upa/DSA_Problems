package CodeChef.FEB221C;

import java.util.Scanner;

public class CHEFBARBER {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0) {

            int n,m;
            n = sc.nextInt();
            m = sc.nextInt();

            System.out.println(n*m);

            T--;
        }
    }
}
