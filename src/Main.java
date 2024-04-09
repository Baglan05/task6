import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sec = new Scanner(System.in);
        int a = sec.nextInt();
        int n = sec.nextInt();

        System.out.println(func(a, n));
    }

    /**
     * This function calculates the nth power of a number recursively.
     *
     * @param a The base number.
     * @param n The exponent (non-negative integer).
     * @return The result of a raised to the power of n.
     */
    public static int func(int a, int n) {

        // Base case: any number to the power of 0 is 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: multiply a by the result of power(a, n-1)
        else {
            return a * func(a, n-1);
        }
    }

}