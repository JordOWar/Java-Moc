
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(3, 9);

    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        int first = beginning;
        int last = end;

        while (first <= end) {
            int result = first % 3;
            if (result == 0) {
                System.out.println(first);
                ++first;
            } else {

                ++first;
            }

        }
    }
}
