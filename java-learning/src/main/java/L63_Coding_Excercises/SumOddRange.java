package L63_Coding_Excercises;

public class SumOddRange {

    public static void main(String[] args) {
        System.out.println(sumOdd(5,2));

    }

    public static boolean isOdd(int number){
        if(number > 0){
            if(number % 2 == 1){
                return true;
            }
        }
        return false;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if(start > 0 && start <= end){
            for (int i = 0; end >= (start + i); i++){
                if(isOdd(start+i)){
                    sum += start + i;
                }
            }
            return sum;
        }
        return -1;
    }

}
