package L60_Coding_exercises;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println(isLeapYear(300));

        System.out.println(getDaysInMonth(1,-2020));
    }

    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year){
        if(year < 1 || year > 9999){
            return -1;
        }else{
            if(isLeapYear(year)){
                return switch (month){
                    case 1, 10, 7, 8, 12, 3, 5 -> 31; case 2 -> 29;
                    case 4, 9, 11, 6 -> 30;
                    default -> -1;
                };
            }else{
                return switch (month){
                    case 1, 10, 7, 8, 12, 3, 5 -> 31; case 2 -> 28;
                    case 4, 9, 11, 6 -> 30;
                    default -> -1;
                };
            }
        }
    }

}
