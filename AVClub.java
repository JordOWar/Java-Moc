
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){ 
            String input = scanner.nextLine();
            String [] pieces = input.split(" ");
            for (int i = 0; i < pieces.length; i++){
                String find = pieces[i];
                if (find.contains ("av")){
                System.out.println(pieces[i]);
      
            }
                
        }
            
            if (input.equals("")){
                break;
            }
    }
}
}
