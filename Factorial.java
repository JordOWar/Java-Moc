
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int n = Integer.valueOf(scanner.nextLine());
        int i, fact = 1;
        for (i = 1; i <= n; ++i) {
            fact = fact * i;

        }
        System.out.println("Factorial: " + fact);

    }
}
