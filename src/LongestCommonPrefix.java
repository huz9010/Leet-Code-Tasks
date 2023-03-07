public class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] strs = {"ab", "a"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int shortestWordIndex = -1;
        int length = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < length)  {
                length = strs[i].length();
                shortestWordIndex = i;
            }
        }

        String shortestWord = strs[shortestWordIndex];
        for (int i = 0; i < shortestWord.length(); i++) {
            char currentChar = shortestWord.charAt(i);

            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != currentChar)   {
                    return sb.toString();
                }
            }
            sb.append(shortestWord.charAt(i));
        }
        return sb.toString();
    }
}
