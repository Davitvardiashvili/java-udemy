package L50_Coding_exercises;

public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176)); // false
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.1756)); // true
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0)); // true
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        int scaledNum1 = (int) (a * 1000);
        int scaledNum2 = (int) (b * 1000);

        return scaledNum1 == scaledNum2;
    }

}
