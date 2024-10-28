package covidchecker;

import java.util.Scanner;

public class CovidChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String ans1, ans2, ans3, review;
        do {
            System.out.print("Do you have a fever (yes/no): ");
            ans1 = sc.next();
            System.out.print("Do you have a cough (yes/no): ");
            ans2 = sc.next();
            System.out.print("Do you have a difficulty in breathing (yes/no): ");
            ans3 = sc.next();
            
            if(ans1.equalsIgnoreCase("Yes") || ans2.equalsIgnoreCase("Yes") || ans3.equalsIgnoreCase("Yes")) {
                System.out.println("You may have COVID-19 symptoms. Please consult a healthcare professional.");
            }else {
                 System.out.println("You do not exhibit significant COVID-19 symptoms. Stay safe!");
            }
            
            
            System.out.print("Do you want to check symptoms again (yes/no): ");
            review = sc.next();
            
            
        }while(review.equalsIgnoreCase("Yes"));
    }
    
}
