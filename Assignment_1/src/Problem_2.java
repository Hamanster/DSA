import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your Weight in kg : ");
        double w = sc.nextDouble();
        
        System.out.println("Enter your height in meter : ");
        double h = sc.nextDouble();
        
        double bmi=w/(h*h);
        
        if(bmi<18.5)
            System.out.println("Underweight");
        
        else if(bmi>=18.5 && bmi <= 24.9)
            System.out.println("Normal Weight");
        
        else if(bmi>=25.0 && bmi <= 29.9)
            System.out.println("Over Weight");
        
        else if(bmi>=30.0)
            System.out.println("Obese");
        
        
        
        sc.close();
    
    }
    
}
