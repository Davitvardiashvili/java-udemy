package L65_While_loop_challenge;

public class Main {

    public static void main(String[] args) {

        int start = 5;
        int evenCounter = 0;
        int oddCounter = 0;

        while(20 >= start){
            if(isEvenNumber(start)){
                System.out.println("Even Number: " + start);
                evenCounter ++;
            }else{
                oddCounter++;
            }
            if(evenCounter >= 5){
                break;
            }
            start ++;
        }
        System.out.println("Even Numbers Found: " + evenCounter);
        System.out.println("Odd Numbers Found: " + oddCounter);


    }

    public static boolean isEvenNumber(int number){

        if(number > 0){
            if(number % 2 == 0){
                return true;
            }
        }
        return false;

    }

}
