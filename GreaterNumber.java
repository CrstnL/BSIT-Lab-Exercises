package greaternumber;

import java.util.Scanner;
public class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        if (num1 > num2) {
            System.out.println("The first number is greater than the second number.");
            
        }else if (num1 < num2) {
            System.out.println("The second number is greater than the first number.");
            
        }else {
            System.out.println("The first and second number are equal.");
        }
    }
    
}
