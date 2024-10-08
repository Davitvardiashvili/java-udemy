package L50_Coding_exercises;

public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }

    public static boolean hasTeen(int a, int b, int c) {
        if (isTeen(a) || isTeen(b) || isTeen(c)){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int age) {
        if(age >= 13 && age <= 19){
            return true;
        }
        return false;
    }

}
