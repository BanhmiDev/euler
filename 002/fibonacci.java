class Fibonacci {

    public static void solve(int limit) {
        int sum = 0;

        // Fibonacci variables
        int a = 0;
        int b = 1;
        int c = 0;

        while (sum < limit) {

            // Only even ones
            if (c % 2 == 0)
                sum += c;

            // Fibonacci
            c = a + b;
            a = b;
            b = c;
        }
        
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        solve(4000000);
    }
}
