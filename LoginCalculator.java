
package logincalculator;

import java.util.Scanner;

public class LoginCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        String username = "Crstn";
        int password = 1209;
        
        boolean loop = false;
        
        do {
        System.out.print("Enter username: ");
        String inputUsername = sc.next();
        
        System.out.print("Enter password: ");
        int inputPassword = sc.nextInt();
        
        if (inputUsername.equals(username) && inputPassword == password) {
            System.out.println("Login Successfully");
            break;
            
        }else {
            System.out.println("Invalid username or password. Please try again ");
        }
        
       }while(!loop);
        
        
        System.out.println("~~WELCOME TO MATH CACULATOR~~");
        
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter operator (+,-,*,/): ");
        char operator = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        
        double result = 0;
        switch(operator) {
            case '+':
                result = num1 + num2;
                break;
                
            case '-':
                result = num1 - num2;
                break;
                
            case '*':
                result = num1 * num2;
                break;
                
            case '/':
                result = num1 / num2;
                break;
                
            default:
            System.out.println("Invalid operator!");
            break;
        }
            System.out.println(num1 + " " + operator + " " + num2 + " " + "= " + result);    
    }
    
}
