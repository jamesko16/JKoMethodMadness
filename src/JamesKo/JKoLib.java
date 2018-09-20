package JamesKo;

public class JKoLib {
    public static boolean isPalindrome(String str) {
        String word = "";
        int i = str.length() - 1;
        while (i >= 0) {
            word = word + str.substring(i, i + 1);
            i--;
        }
        if (word.equals(str)) {
            return true;
        } else {
            return false;
        }
    }
}
    public static string dateStr(String output)
    {

    }