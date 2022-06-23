package CodeStudio;

public class C920478 {
    
    public static long sum(int n) {
        long sum;
        sum = (long) (n) * (n+1) / 2;
        return sum;
    }
    
    public static long product(int n) {
        long product = 1;

        for (int i = 1; i < n+1; i++) {
            product *= i;
            if(product > 1000000007)
                product = product%1000000007;
        }

        return product;
    }
    
    public static long sumOrProduct(int n, int q) {

        return switch (q) {
            case 1 -> sum(n);
            case 2 -> product(n);
            default -> 0L;
        };
    }
}
