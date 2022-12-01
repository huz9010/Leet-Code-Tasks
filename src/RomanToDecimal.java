import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String roman = scanner.nextLine();

        System.out.println(romanToInt(roman));
    }


        public static int romanToInt(String s) {

            Map<Character, Integer> romanToInt = new HashMap<>();

            romanToInt.put('I', 1);
            romanToInt.put('V', 5);
            romanToInt.put('X', 10);
            romanToInt.put('L', 50);
            romanToInt.put('C', 100);
            romanToInt.put('D', 500);
            romanToInt.put('M', 1000);

            int decimal = 0;

            if (s.length() == 1)    {
                decimal = romanToInt.get(s.charAt(0));
            }   else {

                StringBuilder roman = new StringBuilder(s);
                while (!roman.isEmpty()){

                    char currentChar = roman.charAt(0);
                    char nextChar = 0;
                    if (roman.length() > 1) {
                        nextChar = roman.charAt(1);
                    }

                    if (currentChar == 'I' && (nextChar == 'V' || nextChar == 'X')) {
                        decimal += romanToInt.get(nextChar) - romanToInt.get(currentChar);
                        roman.delete(0, 2);
                    } else if (currentChar == 'X' && (nextChar == 'L' || nextChar == 'C')) {
                        decimal += romanToInt.get(nextChar) - romanToInt.get(currentChar);
                        roman.delete(0, 2);
                    } else if (currentChar == 'C' && (nextChar == 'D' || nextChar == 'M')) {
                        decimal += romanToInt.get(nextChar) - romanToInt.get(currentChar);
                        roman.delete(0, 2);
                    } else {
                        decimal += romanToInt.get(currentChar);
                        roman.deleteCharAt(0);
                    }

                }
            }
            return decimal;
    }
}
