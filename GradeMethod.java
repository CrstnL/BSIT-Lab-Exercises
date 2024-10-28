package grademethod;
import java.util.Scanner;

public class GradeMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Subject 1: ");
        int sub1 = sc.nextInt();
        System.out.print("Subject 2: ");
        int sub2 = sc.nextInt();
        System.out.print("Subject 3: ");
        int sub3 = sc.nextInt();
        
        System.out.println(grade(sub1, sub2, sub3));
    }
    public static String grade(int sub1, int sub2, int sub3) {
           int average = (sub1 + sub2 + sub3) / 3;
        
           if (average > 85) {
               return "Passed";
               
           }else {
               return "Failed";
           }
    
    }
}
