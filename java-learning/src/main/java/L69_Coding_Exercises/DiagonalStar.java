package L69_Coding_Exercises;

public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(200);
    }

    public static void printSquareStar(int number){
        if (number < 5){
            System.out.println("Invalid Value");
        }else{
            int rowCount = number + 2;

            for (int i = 1; i <= number; i++ ){
                int j = 1;
                while (number >= j){
                    if(i == 1 || i == number){
                        System.out.print('*');
                    }else if(j == 1 || j == number){
                        System.out.print('*');
                    }else if (i == j){
                        System.out.print('*');
                    }else if (j == rowCount - (i + 1)){
                        System.out.print('*');
                    }else{
                        System.out.print(' ');
                    }
                    j++;
                }
                System.out.println();
            }
        }
    }

}
