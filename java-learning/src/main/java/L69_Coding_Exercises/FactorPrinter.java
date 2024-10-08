package L69_Coding_Exercises;

public class FactorPrinter {

    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }

    public static void printFactors(int number){
        if (number > 0){
            for(int i = 1; number >= i; i++){
                if (number % i == 0){
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("Invalid Value");
        }
    }

}
