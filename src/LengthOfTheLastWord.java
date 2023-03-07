public class LengthOfTheLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }

    public static int lengthOfLastWord(String s) {
        int lastSpaceIndex = -1;
        s = s.trim();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                lastSpaceIndex = i;
                break;
            }
        }
        return s.length() - lastSpaceIndex - 1;
    }
}
