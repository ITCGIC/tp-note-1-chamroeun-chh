import java.util.Scanner;

public class Task3 {

    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);
        int hours;
        int minutes;
        int seconds;
        // int totalSecond;
        System.out.println("Please input hours: ");
        hours = input.nextInt();
        System.out.println("Please input minutes: ");
        minutes = input.nextInt();
        System.out.println("Please input seconds: ");
        seconds = input.nextInt();

        hours = hours * 3600;
        minutes = minutes * 60;
        // totalSecond = seconds;

        System.out.println("--------------------------------------------------");
        final int temp = hours + minutes + seconds;
        System.out.println("Number of seconds = " + temp);

    }
}
