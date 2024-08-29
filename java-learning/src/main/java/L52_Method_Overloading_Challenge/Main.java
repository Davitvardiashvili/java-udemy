package L52_Method_Overloading_Challenge;

public class Main {

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5,8));
    }

    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches){
        return convertToCentimeters(feet * 12 + inches);
    }

}
