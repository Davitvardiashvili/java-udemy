package L69_Coding_Exercises;

public class NumberToWords {

    public static void main(String[] args) {
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));

        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);

    }

    public static void numberToWords(int number){
        int reversedNumber = reverse(number);
        int singleNumber = 0;
        if (number >= 0){
            for (int i = 1; getDigitCount(number) >= i; i++){
                singleNumber = reversedNumber % 10;
                reversedNumber = reversedNumber / 10;
                switch (singleNumber){
                    case 0 -> System.out.println("Zero");
                    case 1 -> System.out.println("One");
                    case 2 -> System.out.println("Two");
                    case 3 -> System.out.println("Three");
                    case 4 -> System.out.println("Four");
                    case 5 -> System.out.println("Five");
                    case 6 -> System.out.println("Six");
                    case 7 -> System.out.println("Seven");
                    case 8 -> System.out.println("Eight");
                    case 9 -> System.out.println("Nine");
                }
            }

        }else{
            System.out.println("Invalid Value");
        }
    }

    public static int reverse(int number){
        int reverse = 0;

        if (number > 0){
            while(number > 9){
                reverse += (number % 10);
                reverse *= 10;
                number = number / 10;
            }
            reverse += number;
        }else{
            while(number < -9){
                reverse += (number % 10);
                reverse *= 10;
                number = number / 10;
            }
            reverse += number;
        }
        return reverse;
    }

    public static int getDigitCount(int number){
        if(number >= 0){
            if (number > 9){
                int i = 0;
                while (number > 9){
                    number = number / 10;
                    i++;
                }
                return i + 1;
            }else{
                return 1;
            }
        }
        return -1;
    }

}
