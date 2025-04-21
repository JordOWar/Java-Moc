
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = 0;
        int sum = 0;
        int positivenum = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                if (positivenum == 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                } else {
                    double average = (sum * 1.0) / (numbers * 1.0);
                    System.out.println(average);
                    break;
                }
            } else if (number > 0) {
                positivenum = positivenum + 1;
                numbers = numbers + 1;
                sum = sum + number;
                continue;
            } else {
                continue;

            }
        }

    }
}
