package Activity23;
import java.lang.*;
public class PalindromeDetector {
    static boolean Detector(String str, int s, int e)
    {
        if (s == e)
            return true;

        if ((str.charAt(s)) != (str.charAt(e)))
            return false;

        if (s < e + 1)
            return Detector(str, s + 1, e - 1);

        return true;
    }
    static boolean isPalindrome(String str)
    {
        int n = str.length();

        if (n == 0)
            return true;

        return Detector(str, 0, n - 1);
    }
    public static void main(String args[])
    {
        String str = "lndgiouagoirekhneHJm";
        str = str.toLowerCase();

        if (isPalindrome(str))
            System.out.println(str + " is a palindrome.");
        else
            System.out.println(str + " is not a palindrome.");
    }
}