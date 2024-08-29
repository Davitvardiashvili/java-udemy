package L54_Coding_exercises;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
    }

    public static double area(double radius){
        if (radius < 0){
            return -1;
        }
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y){
        if (y < 0 || x < 0){
            return -1;
        }
        return x * y;
    }


}
