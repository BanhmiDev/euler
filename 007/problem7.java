class Problem7 {

    /**
     * Determine if we got a prime number.
     */
    public static boolean isPrime(int number) {
        if (number == 0 || number == 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false; // Multiple of 2

        // Check integers up to square root
        for (int i = 3; i*i <= number; i+=2) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void solve(int limit) {
        int count = 0;
        int increment = 0;
        
        while (true) {
            if (isPrime(increment)) {
                count++;
            }

            if (count == limit) {
                System.out.println(increment); // Our prime number
                break;
            }

            increment++;
        }
    }
    
    public static void main(String[] args) {
        solve(10001);
    }
}
