package L69_Coding_Exercises;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }

    public static boolean hasSameLastDigit(int x, int y, int z) {

        if (isValid(x) && isValid(y) && isValid(z)) {
            x = x % 10;
            y = y % 10;
            z = z % 10;
            if (x == y || x == z || y == z) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000){
            return true;
        }
        return false;
    }

}
