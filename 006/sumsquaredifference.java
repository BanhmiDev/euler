class SumSquareDifference {

    public static void solve(int limit) {
        int sum_of_square = 0;
        int square_of_sum = 0;

        for (int i = 0; i <= limit; i++) {
            sum_of_square += i*i;
            square_of_sum += i; // Square not applied yet
        }

        square_of_sum *= square_of_sum; // Now we got the square

        System.out.println(square_of_sum - sum_of_square);
    }
    
    public static void main(String[] args) {
        solve(100);
    }
}
