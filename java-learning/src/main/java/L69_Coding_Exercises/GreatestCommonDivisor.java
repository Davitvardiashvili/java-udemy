package L69_Coding_Exercises;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second){
        int commonDivisor = 0;
        if (first > 9 && second > 9){
            for (int i = 2; first > i; i++){
                if (first % i == 0 && second % i == 0){
                    commonDivisor = i;
                }
            }
            return commonDivisor;
        }
        return -1;
    }

}
