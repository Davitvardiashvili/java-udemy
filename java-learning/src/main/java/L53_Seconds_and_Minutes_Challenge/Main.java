package L53_Seconds_and_Minutes_Challenge;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(3600));
        System.out.println(getDurationString(67,42));
    }

    public static String getDurationString(int seconds){
        if(seconds > 0){
            int hours = seconds / 3600;
            int minutes = (seconds % 3600) / 60;
            seconds = seconds % 60;
            return hours + "h " + minutes + "m " + seconds + "s";
        }
        return "Invalid Time";

    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes >= 0 && seconds >= 0 && seconds <= 59){
            return getDurationString(minutes * 60 + seconds);
        }
        return "Invalid Time";
    }


}
