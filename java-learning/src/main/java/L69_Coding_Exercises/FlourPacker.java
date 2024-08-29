package L69_Coding_Exercises;

public class FlourPacker {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0,4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(1, 0, 6));
        System.out.println(canPack(2, 1, 5));
        System.out.println(canPack(5,3,24));
        System.out.println(canPack(4,18,19));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        boolean result = false;
        int totalBigWeight = bigCount * 5;
        if (totalBigWeight >= goal) {
            int remaining = goal % 5;
            if (smallCount >= remaining) {
                result = true;
            }
        } else {
            if (smallCount >= goal - totalBigWeight) {
                result = true;
            }
        }
        return result;
    }

}
