package L58_Traditional_Switch_Challenge;

public class Main {

    public static void main(String[] args) {

        char letter = 'A';

        switch (letter){
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            default:
                System.out.println("Not found");
                break;
        }

    }

}
