class SumOfPrimes {

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

    public static void solve(int limit) {
        int i = 0;
        long sum = 0;
        
        while (i < limit) {
            if (isPrime(i))
                sum += i;
            i++;
        }
        
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        solve(2000000);
    }
}
