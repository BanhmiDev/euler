class Palindrome {

    /**
     * Checks if a given number represents a palindrome.
     */
    public static boolean isPalindrome(String number) {
        String reversed = new StringBuilder(number).reverse().toString();
        return number.equals(reversed);
    }

    public static void solve() {
        int maxProd = 0;

        // Product of two 3-digit numbers
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int prod = i*j;
                if (isPalindrome(Integer.toString(prod)) && prod > maxProd)
                    maxProd = prod;
            }
        }

        System.out.println(maxProd);
    }
    
    public static void main(String[] args) {
        solve();
    }
}


