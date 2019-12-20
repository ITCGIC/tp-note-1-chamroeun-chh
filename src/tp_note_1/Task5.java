import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double riels = 0;
        double dollars = 4000;

        System.out.print("Please input money in Riels: ");
        riels = input.nextDouble();
        double conversion = riels / 4000;

        System.out.println("-------------------------------------------------");
        System.out.println(riels + " Riels : " + conversion);

    }
}