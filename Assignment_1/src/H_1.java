import java.util.Scanner;

public class H_1 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the values : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();

        if((a+b)==c)
            System.out.println("They can be used is a+b=c");
        else if ((b-c)==a)
            System.out.println("They can be used in a=b-c");
        else if ((a*b)==c)
            System.out.println("They can be used in ab=c");
        else
            System.out.println("They cannot be used in any formula.");
        
        sc.close();
        
    }
}
