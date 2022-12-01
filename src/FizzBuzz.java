import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(fizzBuzz(n));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 ==0)    {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            }   else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
