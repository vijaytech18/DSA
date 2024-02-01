package dsa.easy;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("is num palindrome " + isPalindrome(4567654));
    }

    public static boolean isPalindrome(int x) {
        int storeinput = x;
        int reverseNum = 0;
        while (x > 0) {
            int lastNum = x % 10;
            System.out.println(lastNum);
            x = x / 10;
            reverseNum = reverseNum * 10 + lastNum;
            System.out.println(reverseNum);
        }
        if (storeinput == reverseNum) {
            return true;
        } else
            return false;
    }
}
