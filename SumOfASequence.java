
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int end = Integer.valueOf(scanner.nextLine());
        int addition = 0;
        int result = 0;
        int sum = 0;
        for (int i = 0; i < end; i++) {
            addition++;
            result = sum + addition;
            sum = result;

        }
        System.out.println("The sum is " + result);

    }
}
