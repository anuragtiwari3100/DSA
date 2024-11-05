public class FactoralOfSeries {

    public static void calFactoralOfSeries(int n) {
        for (int i = 1; i <= n; i++) {
            int factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j; // Calculate factorial
            }
            System.out.printf("\n%d! is equal to %d", i, factorial);
        }
    }

    public static void main(String[] args) {
        System.out.println("Radhe-Radhe");
        calFactoralOfSeries(10); // Call the method with the desired range
    }
}
