import java.util.Scanner;

public class PowXn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(myPow(x, n));
    }

    public static double myPow(double x, int n) {

        if (n == 0) {
            return 1;
        }

        double temp = myPow(x, n / 2);

        if (n % 2 == 0) {
            return temp * temp;
        }   else {
            if (n > 0) {
                return x * temp * temp;
            } else return temp * temp / x;
        }
    }
}
