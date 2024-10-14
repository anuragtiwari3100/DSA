import java.util.Scanner;

public class OptimiCalculatePow {
    public static int optimizepower(int x, int n) {
        if (n == 0) {
            return 1;
        }

        // Divide the problem into smaller subproblems
        int halfpower = optimizepower(x, n / 2);

        // Combine the results of subproblems
        int halfPowerSq = halfpower * halfpower;

        // If n is odd, multiply by x
        if (n % 2 != 0) {
            halfPowerSq *= x;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base:");
        int x = sc.nextInt();
        System.out.print("Enter the power:");
        int n = sc.nextInt();
        System.out.println("Exponent is:" + optimizepower(x, n));
        sc.close();
    }
}


//time  complexxity
  
/*
        tc ~~ work done = total caalls/level * per call
                            log n*k
                            O(log n*k)
                            O(log n);
 */
