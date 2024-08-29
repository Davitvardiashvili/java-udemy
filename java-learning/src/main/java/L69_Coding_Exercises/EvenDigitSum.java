package L69_Coding_Exercises;

public class EvenDigitSum {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }

    public static int getEvenDigitSum(int number){

        if(number >= 0){
            int sumOfEvens = 0;
            int evenChecker;
            while (number > 9){
                evenChecker = number % 10;
                if (evenChecker % 2 == 0){
                    sumOfEvens += evenChecker;
                }
                number = number / 10;
            }
            if (number % 2 == 0){
                sumOfEvens += number;
            }
            return sumOfEvens;
        }


        return -1;
    }

}
