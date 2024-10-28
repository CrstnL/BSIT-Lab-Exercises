package bmi;

public class BMI {
    public static void main(String[] args) {
        double Weight = 43.5;
        double Height = 1.51;
        double bmi;
        
        bmi = Weight / (Height * Height);
        System.out.println(bmi);
        
        if (bmi < 18.5) {
            System.out.println("Remarks: Underweight");
            
        }else if (bmi >=18.5 && bmi < 25.0) {
            System.out.println("Remarks: Normal");
            
        }else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.println("Remarks: Overweight");
            
        }else if (bmi >= 30.0) {
            System.out.println("Remarks: Obese");
        }
    }
    
}
