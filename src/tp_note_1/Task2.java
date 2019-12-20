import java.util.Scanner;

public class Task2 {

    public static void main(final String[] args) {

        Scanner input = new Scanner(System.in);
        int hours;
        int minutes;
        int seconds;
        int totalSecond;
        System.out.println("Input number of seconds: ");
        seconds = input.nextInt();

        hours = seconds / 3600;
        minutes = (seconds % 3600) / 60;
        int secondsOuput = (seconds % 60) % 60;

        System.out.println("Time corresponding to " + seconds + "seconds is");
        System.out.println(hours + " hours : " + minutes + " minutes : " + secondsOuput + "seconds");
    }

}
