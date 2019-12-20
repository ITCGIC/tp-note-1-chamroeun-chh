import java.util.Scanner;

public class Task4 {
    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in);

        System.out.print("Please input start hours: ");
        int hours = input.nextInt();

        System.out.print("Please input start minutes: ");
        int minutes = input.nextInt();

        System.out.print("Please input start seconds: ");
        int seconds = input.nextInt();

        System.out.print("Please input end hours: ");
        int hourEnd = input.nextInt();

        System.out.print("Please input end minutes: ");
        int minutesEnd = input.nextInt();

        System.out.print("Please input end seconds: ");
        int secondsEnd = input.nextInt();

        if (hours > 24 || hourEnd > 24) {
            System.out.println("\ninvalid hours format.");
        } else if (minutes > 60 || minutesEnd > 60) {
            System.out.println("\nnvalid Minutes format.");
        }

        else if (seconds > 60 || secondsEnd > 60) {
            System.out.println("\ninvalid second format.");
        }

        // Total call duration
        int totalHours = hourEnd - hours;
        int totalMinutes = minutesEnd - minutes;
        int totalSecond = secondsEnd - seconds;
        double SecondFormat;

        // Change time format to seonds
        int totalHoursToSecond = totalHours * 3600;
        int totalMinutesToSecond = totalMinutes * 60;
        SecondFormat = totalHoursToSecond + totalMinutesToSecond + totalSecond;

        // Change seconds to minutes
        double SecondFormatToMinute = SecondFormat / 60;

        // Total cost
        double totalcost = SecondFormatToMinute * 0.05;

        System.out.println("---------------------Results-----------------------------\n");
        System.out.println("Total call duration:" + totalHours + "h " + totalMinutes + "m " + totalSecond + "s");
        System.out.println("Total cost of this call: $" + totalcost);
    }

}
