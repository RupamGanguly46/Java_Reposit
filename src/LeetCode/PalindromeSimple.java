package LeetCode;

public class PalindromeSimple {
        public static void main(String[] args) {
                System.out.println(palindrome(1234));
        }
        public static boolean palindrome(int x){
                if (x < 0) {
                        return false;
                }
                int actual = x;
                int reverse = 0;
                while (x != 0) {
                        int remainder = x % 10;
                        reverse = reverse * 10 + remainder;
                        x = (x - remainder) / 10;
                }
                return actual == reverse;
        }
}
