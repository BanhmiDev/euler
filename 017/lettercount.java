class LetterCount {

    private static String[] ONES = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static String[] TEENS = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static String[] TENS = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static String getTen(int number) {
        if (number < 10) {
            return ONES[number];
        } else if (number < 20) {
            return TEENS[number - 10];
        } else {
            return TENS[number / 10 - 2] + (number % 10 != 0 ? ONES[number % 10] : ""); 
        }
    }
    
    public static String numberToString(int number) {
        if (number < 100) {
            return getTen(number);
        } else {
            String result = "";
            
            if (number >= 1000)
                result += getTen(number / 1000) + "thousand";
            if (number / 100 % 10 != 0)
                result += ONES[number / 100 % 10] + "hundred";
            if (number % 100 != 0)
                result += "and" + getTen(number % 100);

            return result;
        }
    }
    
    public static void solve(int limit) {
        int sum = 0;
        
        for (int i = 1; i <= limit; i++) {
            sum += numberToString(i).length();
        }

        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        solve(1000);
    }
}
