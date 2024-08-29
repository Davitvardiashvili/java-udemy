package L48_Method_challenge;

public class Main {
    public static void main(String[] args) {

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("Tim", position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("Tim", position);

        position = calculateHighScorePosition(100);
        displayHighScorePosition("Tim", position);

        position = calculateHighScorePosition(25);
        displayHighScorePosition("Tim", position);
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int score){
        int position = 4;
        if(score >= 1000){
            position = 1;
        }else if(score >= 500){
            position = 2;
        }else if(score >= 100){
            position = 3;
        }
        return position;
    }
}
