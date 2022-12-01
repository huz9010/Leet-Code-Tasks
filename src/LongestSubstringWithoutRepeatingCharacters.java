import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        System.out.println(lengthOfLongestSubstring(string));
    }

    public static int lengthOfLongestSubstring(String s) {
        String longestSubstr = "";
        int longest = 0;
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (temp.indexOf(String.valueOf(s.charAt(i))) == -1)    {
                temp.append(s.charAt(i));
            }   else {
                if (longestSubstr.length() < temp.length()) {
                    longestSubstr = temp.toString();

                }
                temp.delete(0, temp.length());
                i--;
            }
            longestSubstr = temp.toString();
        }
        longest = longestSubstr.length();
        return longest;
    }
}
