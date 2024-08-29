package L62_Sum_3_and_5_Challenge;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        int sumOfMatches = 0;
        for (int i = 1;count < 5 && i < 1000; i++){
            if (i % 3 == 0 && i % 5 == 0){
                count++;
                sumOfMatches += i;
                System.out.println(i);
            }
        }
        System.out.println(count);
        System.out.println(sumOfMatches);

    }

}
