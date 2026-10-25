public class VowelPermutation {
    static long factorial(int n) {
        long fact = 1;

        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static long vowelPermutation(String s) {
        int consonants = 0;

        for (char c : s.toCharArray()) {
            char ch = Character.toLowerCase(c);

            if (Character.isLetter(c) &&
                ch != 'a' && ch != 'e' &&
                ch != 'i' && ch != 'o' && ch != 'u') {
                consonants++;
            }
        }

        if (consonants == 0) {
            return 0;
        }

        return factorial(consonants);
    }

    public static void main(String[] args) {
        System.out.println(vowelPermutation("ABC"));
        System.out.println(vowelPermutation("CDF"));
    }
}
