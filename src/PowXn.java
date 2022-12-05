import java.util.Scanner;

public class PowXn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(myPow(x, n));
    }

    public static double myPow(double x, int n) {

        double result = 1;

        for (int i = 1; i <= Math.abs(n); i++) {
            result *= x;
        }

        if (n < 0)  {
            result = 1 / result;

        }
        return result;
    }
}
