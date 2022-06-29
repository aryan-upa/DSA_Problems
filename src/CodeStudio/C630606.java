package CodeStudio;

public class C630606 {
    /*
        Efficient Method :
            1- Find the remainder of n by taking its modulo with 4.
                If rem = 0, then XOR will be same as n.
                Or if rem = 1, then XOR will be 1.
                Or if rem = 2, then XOR will be n+1.
                else rem = 3, then XOR will be 0.
     */
    public static int calculateXOR(int n) {
        switch(n % 4) {
            case 0: return n;
            case 1: return 1;
            case 2: return n+1;
            default : return 0;
        }
    }
}
