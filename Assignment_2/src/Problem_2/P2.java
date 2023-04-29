package Problem_2;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter 1st real and imaginary number :");
		
		Complex c1=new Complex(sc.nextInt(),sc.nextInt());
		
		System.out.println("Enter 2nd real and imaginary number :");
		
		Complex c2=new Complex(sc.nextInt(),sc.nextInt());
		
		Complex c3= new Complex();
		
		c3=c1.add(c1, c2);
		
		c3.display();
		
		
		sc.close();
	}

}
