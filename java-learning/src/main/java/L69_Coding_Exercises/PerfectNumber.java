package L69_Coding_Exercises;

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

    }

    public static boolean isPerfectNumber(int number){
        if (number > 0){
            int sumOfNumber = 0;
            for(int i = 1; number > i; i++){
                if (number % i == 0){
                    sumOfNumber += i;
                }
            }
            if (sumOfNumber == number){
                return true;
            }
            return false;
        }
        return false;
    }

}
