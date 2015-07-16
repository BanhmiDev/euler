class Primefactor {

    /**
     * Determine if we got a prime number.
     */
    public static boolean isPrime(long number) {
        if (number == 0 || number == 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false; // Multiple of 2

        // Check integers up to square root
        for (long i = 3; i*i <= number; i+=2) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void solve(long number) {
        long maxPrime = 0;

        for (long i = 2; i < number / i; i++) {
            if ((number % i == 0) && isPrime(i))
                maxPrime = i;
        }

        System.out.println(maxPrime);
    }
    
    public static void main(String[] args) {
        solve(600851475143L);
    }
}
