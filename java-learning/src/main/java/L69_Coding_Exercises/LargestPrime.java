package L69_Coding_Exercises;

public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(7));
        System.out.println(getLargestPrime(2));
    }

    public static int getLargestPrime(int number){
        if (number > 1){
            int lasrgestPrime = 0;
            int prime = 0;
            for (int i = 2; i < number; i++){
                if (number % i == 0){
                    lasrgestPrime = i;
                }
            }
            if (lasrgestPrime == 0){
                lasrgestPrime = number;
            }

            for (int j = 2; j < lasrgestPrime; j++){
                if (lasrgestPrime % j == 0){
                    prime = j;
                }else{
                    prime = lasrgestPrime;
                }
            }
            return prime;
        }

        return -1;
    }

}
