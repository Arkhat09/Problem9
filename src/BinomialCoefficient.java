public class BinomialCoefficient {
    public static int calculateBinomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return calculateBinomialCoefficient(n - 1, k - 1) + calculateBinomialCoefficient(n - 1, k);
    }

    public static void main(String[] args) {
        int n = 2;
        int k = 1;
        System.out.println("C(" + n + ", " + k + ") = " + calculateBinomialCoefficient(n, k));

        n = 7;
        k = 3;
        System.out.println("C(" + n + ", " + k + ") = " + calculateBinomialCoefficient(n, k));
    }
}
