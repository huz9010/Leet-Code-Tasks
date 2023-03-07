public class PalindromeNumber {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(int x)   {
        String numStr = String.valueOf(x);
        StringBuilder sb = new StringBuilder();
        for (int i = numStr.length() - 1; i >= 0; i--) {
            sb.append(numStr.charAt(i));
        }
        return sb.toString().equals(numStr);
    }
}
