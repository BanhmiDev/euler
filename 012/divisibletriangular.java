class DivisibleTriangular {

    public static void solve(int limit) {
        
        int number = 1;
        int inc = 2;
        int divisorCount = 0;

        while (divisorCount <= limit) {
            for (int j = 1; j < Math.sqrt(number); j++) { // Would take too long if we don't limit it to sqrt(number)
                if (number % j == 0)
                    divisorCount += 2;
            }

            if (divisorCount > limit) {
                System.out.println(number);
                break;
            }
            System.out.println(number);
            number += inc; // New triangle number
            inc++;
            divisorCount = 0;
        }
    }

    public static void main(String[] args) {
        solve(500);
    }
}
