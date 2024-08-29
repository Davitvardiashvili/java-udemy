package L69_Coding_Exercises;

public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));

    }

    public static boolean hasSharedDigit(int x, int y){
        if (x >= 10 && x <= 99 && y >= 10 && y <=99){
            int xLast = x % 10;
            int yLast = y % 10;
            int xFirst = x / 10;
            int yFirst = y /10;

            if (xFirst == yFirst || xFirst == yLast || xLast == yFirst || xLast == yLast){
                return true;
            }
            return false;
        }

        return false;

    }

}
