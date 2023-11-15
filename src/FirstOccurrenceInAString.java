import java.util.Scanner;

public class FirstOccurrenceInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String haystack = sc.nextLine();
        String needle = sc.nextLine();

        System.out.println(strStr(haystack, needle));
    }
    public static int strStr(String haystack, String needle) {
        if (haystack.contains(needle))  {
            return haystack.indexOf(needle);
        }   else {
            return -1;
        }
    }
}
