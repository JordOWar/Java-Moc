
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greatest = 0;
        while(true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            } 
            String[] parts = input.split(",");
            int age = Integer.valueOf(parts[1]);
            if (age > greatest){
                greatest = age;
            }
        }
        System.out.println("Age of the oldest: " + greatest);


    }
}
