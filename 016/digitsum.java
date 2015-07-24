import java.math.BigInteger;

class DigitSum {

    public static void solve(int power) {
        BigInteger base = new BigInteger("2");
        BigInteger result = base.pow(power); // Result of 2^power

        BigInteger sum = BigInteger.ZERO;

        // Faster implementation than converting to string and back again
        while (!result.equals(BigInteger.ZERO)) {
            BigInteger temp = result.divide(BigInteger.TEN);
            BigInteger digit = result.subtract(temp.multiply(BigInteger.TEN));
            result = temp;

            sum = sum.add(digit);
        }

        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        solve(1000);
    }
}
