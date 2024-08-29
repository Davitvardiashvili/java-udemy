package L69_Coding_Exercises;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(112212));
    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int startNumber = number;
        int lastDigit = number % 10;

        if (number > 0){
            while(number > 9){
                reverse += (number % 10);
                reverse *= 10;
                number = number / 10;
            }
            reverse += lastDigit;
        }else{
            while(number < -9){
                reverse += (number % 10);
                reverse *= 10;
                number = number / 10;
            }
            reverse += lastDigit;

        }

        if (reverse == startNumber){
            return true;
        }
        return false;
    }

}
