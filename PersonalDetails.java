
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nameLength = 0;
        int sumOfYears = 0;
        int count = 0;
        String longestName = "";
               
        while (true){
            String input =scanner.nextLine();
            if (input.equals("")){
                break;
            }
            String[] parts = input.split(",");
            String name = parts[0];
            int length = name.length();
            if (length > nameLength){ 
                nameLength = length;
                longestName = name;
            }
                
                
               sumOfYears = sumOfYears + Integer.valueOf(parts[1]);
               count++;
            
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sumOfYears / count));
                
            }
        }
               

    

