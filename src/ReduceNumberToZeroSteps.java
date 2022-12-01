import java.util.Scanner;

public class ReduceNumberToZeroSteps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        System.out.println(numberOfSteps(num));
    }

    public static int numberOfSteps(int num) {
        int steps = 0;

        while (num != 0)    {
            if (num % 2 == 0)   {
                num /= 2;
            }   else {
                num -= 1;
            }
            steps++;
        }
        return steps;
    }
}
