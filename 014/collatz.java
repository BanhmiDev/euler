import java.math.BigInteger;

class Collatz {

    public static int collatz(int number, int current) {
        int count = 1;
        BigInteger n = BigInteger.valueOf(number); // To create the sequence

        while (!n.equals(BigInteger.ONE)) {
            if (n.signum() < 0) return 0; // Shouldn't be negative?
            if (n.mod(BigInteger.valueOf(2)) == BigInteger.ZERO) {
                // Even
                n = n.divide(BigInteger.valueOf(2));
            } else {
                // Odd
                n = n.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE);
            }
            count++;
        }

        return count;
    }

    public static void solve(int limit) {
        int number = 0; // Number with longest chain
        int highestCount = 0;
        int collatzCount = 0;

        for (int i = 1; i < limit; i++) {
            collatzCount = collatz(i, highestCount);
            
            if (collatzCount > highestCount) {
                highestCount = collatzCount;
                number = i;
            }
        }

        System.out.println(number);
    }

    public static void main(String[] args) {
        solve(1000000);
    }
}
