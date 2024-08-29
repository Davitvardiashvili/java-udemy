package L74_Coding_exercises;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int counter = 0;
        int sum = 0;
        long average;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter a number, or any character to exit: ");
                String nextEntry = scanner.nextLine();
                sum += Integer.parseInt(nextEntry);
                counter++;
                System.out.println(scanner);
            } catch (NumberFormatException nfe) {
                average = sum / counter;
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
        }
    }


}
