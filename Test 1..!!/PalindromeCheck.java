public class PalindromeCheck {
    static boolean checkPalindrome(String str) {
        StringBuilder sb=new StringBuilder(str);
        String rev=sb.reverse().toString();
        return  str.equals(rev);


    }
}
