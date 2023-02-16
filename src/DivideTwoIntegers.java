import java.util.Scanner;

public class DivideTwoIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dividend = Integer.parseInt(scanner.nextLine());
        int divisor = Integer.parseInt(scanner.nextLine());

        System.out.println(divide(dividend, divisor));
    }

    private static int divide(int dividend, int divisor) {

        if (dividend == 0) {
            return 0;
        }

        if (divisor == 1) {
            return dividend;
        }

        if (dividend == Integer.MAX_VALUE && divisor == -1) {
            return Integer.MIN_VALUE;
        } else if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        if (divisor == -1) {
            return -dividend;
        }

        int result = 0;
        if ((dividend < 0 && divisor > 0) || dividend > 0 && divisor < 0) {

            while (Math.abs(dividend) >= Math.abs(divisor) || dividend == Integer.MIN_VALUE) {
                dividend += divisor;
                result++;
            }
            return -result;
        } else if ((dividend > 0 && divisor > 0) || dividend < 0 && divisor < 0) {

            while (Math.abs(dividend) >= Math.abs(divisor)) {
                dividend -= divisor;
                result++;
            }
            return result;
        }
        return 0;
    }
}