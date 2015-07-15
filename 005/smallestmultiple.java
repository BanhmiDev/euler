class SmallestMultiple {
    
    public static boolean evenlyDivisible(int number) {
        for (int i = 1; i < 20; i++) {
            if (number % i != 0)
                return false;
        }
        return true;
    }

    public static void solve() {
        int number = 1;
        while (!evenlyDivisible(number)) {
            number += 1;
        }

        System.out.println(number);
    }
    
    public static void main(String[] args) {
        solve();
    }
}
