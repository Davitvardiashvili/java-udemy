package L69_Coding_Exercises;

public class FirstAndLastDigitSum {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));

    }

    public static int sumFirstAndLastDigit(int number){

        if(number >= 0){
            if(number == 0){
                return 0;
            }
            else if(number < 10){
                return number * 2;
            }else{
                int lastDigit = number % 10;
                int firstDigit = 0;
                while(number > 9){
                    number = number / 10;
                    firstDigit = number;
                }
                return lastDigit + firstDigit;
            }
        }
        return -1;
    }

}
