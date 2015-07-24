import java.math.BigInteger;

class Lattice {

    public static BigInteger factorial(int n) {
        BigInteger prod = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            prod = prod.multiply(BigInteger.valueOf(i));
        }

        return prod;
    }

    public static BigInteger binomial(int n, int k) {
        // n! / ((n-k)! * k!)
        return factorial(n).divide(factorial(n-k).multiply(factorial(k)));
    }
    
    public static void solve() {
        System.out.println(binomial(40, 20));
    }

    public static void main(String[] args) {
        solve();
    }
}
