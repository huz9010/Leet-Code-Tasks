import java.util.Scanner;

public class RansomNote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ransomNote = scanner.nextLine();
        String magazine = scanner.nextLine();

        System.out.println(canConstruct(ransomNote, magazine));
    }


    public static boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder magazineStr = new StringBuilder(magazine);
        boolean canConstruct = true;
        for (int i = 0; i < ransomNote.length(); i++) {
            String currentLetter = String.valueOf(ransomNote.charAt(i));
            int index = magazineStr.indexOf(currentLetter);

            if (index == -1) {
                canConstruct = false;
                break;
            }   else {
                magazineStr.deleteCharAt(index);
            }
        }
        return canConstruct;
    }
}



