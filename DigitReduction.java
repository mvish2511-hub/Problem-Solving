public class DigitReduction {
    public static int singleDigit(int n) {
        n = Math.abs(n);

        while (n >= 10) {
            int sum = 0;

            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }

            n = sum;
        }

        return n;
    }

    public static void main(String[] args) {
        System.out.println(singleDigit(38));
        System.out.println(singleDigit(41));
    }
}
