package Problem_5;

import java.util.Scanner;
public class P5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double r;
        int t;

        System.out.println("Enter the Principal amount : ");
        long p=sc.nextLong();
        System.out.println("Do you want to enter rate (y/n)");
        char c= sc.next().charAt(0);
        if(c=='Y'||c=='y'){
            System.out.println("Enter the rate :");
            r=sc.nextDouble();
            System.out.println("Do you want to enter Time (y/n)");
            if(sc.next().charAt(0)=='y'||sc.next().charAt(0)=='Y'){
                System.out.println("Enter the Time : ");
                t=sc.nextInt();
                Deposit d=new Deposit(p,t,r);
                d.display();
            }
            else{
                Deposit d=new Deposit(p,r);
                d.display();
            }
        }
        else {
            System.out.println("Enter the Time : ");
            if(sc.next().charAt(0)=='y'||sc.next().charAt(0)=='Y'){
                System.out.println("Enter the Time : ");
                t=sc.nextInt();
                Deposit d=new Deposit(p,t);
                d.display();
            }
        }

    }
}
