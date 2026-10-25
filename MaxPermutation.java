public class MaxPermutation {
    static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static long maxPermutation(String[] arr, int n) {
        long max = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (char c : arr[i].toCharArray()) {
                char ch = Character.toLowerCase(c);

                if (ch != 'a' && ch != 'e' &&
                    ch != 'i' && ch != 'o' && ch != 'u') {
                    count++;
                }
            }

            if (count > 0) {
                max = Math.max(max, factorial(count));
            }
        }

        return max;
    }

    public static void main(String[] args) {
        String[] arr = {"eio"};
        System.out.println(maxPermutation(arr, 1));
    }
}
