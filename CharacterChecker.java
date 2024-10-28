package characterchecker;

import java.util.Scanner;
public class CharacterChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char input;
        
        System.out.println("Enter character: ");
        input = sc.next().charAt(0);
        
        if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z')) {
            System.out.println("Display " + input + " is a letter.");
            
        }else if (input >= '1' && input <= '9') {
            System.out.println("Display " + input + " is a digit.");
            
        }else {
            System.out.println("Display " + input + " is not a letter or a digit.");
        }
    }
    
}
