
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                double average = (sum * 1.0) / (numbers * 1.0);
                System.out.println("Average of the numbers: " + average);
                break;
            } else {
                numbers = numbers + 1;
                sum = sum + number;
                continue;
            }
        }

    }
}
