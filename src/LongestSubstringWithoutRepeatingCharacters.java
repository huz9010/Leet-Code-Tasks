import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        System.out.println(lengthOfLongestSubstring(string));
    }

    public static int lengthOfLongestSubstring(String s) {
        int longest = 1;
        if (s.isEmpty())    {
            longest = 0;
        }

        int currentLongest = 0;
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
                if (temp.toString().contains(String.valueOf(s.charAt(i)))) {
                    temp.delete(0, temp.length());
                    currentLongest = 1;
                    i--;
                }   else {
                    temp.append(s.charAt(i));
                    currentLongest++;
                }
                if (longest < currentLongest)   {
                    longest = currentLongest;
                }
        }
        return longest;
    }
}
