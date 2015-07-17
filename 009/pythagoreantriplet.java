class PythagoreanTriplet {

    // a^2 + b^2 = c^2 
    // c = sqrt(a^2 + b^2)
    public static double getC(double a, double b) {
        return Math.sqrt(a*a + b*b);
    }


    // ... example, 32 + 42 = 9 + 16 = 25 = 52.
    // ... a + b + c = 1000 ...
    // => increment numbers, check if it's a pythagorean triplet and check if the sum equals 1000
    public static void solve(int number) {
        double prod = 0;
        double a = 3;
        double b = 4;
        double c = 1000;

        while (a + b + getC(a, b) != c) {
            b++;
            if (b > 1000) {
                a++;
                b = a + 1;
            }
        }

        prod = a * b * getC(a, b);
        
        System.out.println(Double.valueOf(prod).longValue()); // (Better) output
    }

    public static void main(String[] args) {
        solve(1000);
    }
}
