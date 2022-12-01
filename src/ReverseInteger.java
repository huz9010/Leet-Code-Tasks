import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        System.out.println(reverse(num));
    }

    public static int reverse(int x) {
        StringBuilder numString = new StringBuilder(String.valueOf(Math.abs(x)));
        numString.reverse();
        int reversedNum = 0;

        try{
            reversedNum = Integer.parseInt(numString.toString());
        }   catch (Exception ignored) {

        }
        if (x < 0)  {
            reversedNum = -reversedNum;
        }
        return reversedNum;
    }
}
