package Problem_1;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your area code, exchange, number");
		
		Phone p1=new Phone();
		Phone p2=new Phone(sc.nextInt(),sc.nextInt(),sc.nextInt());
		p1.area_code=212;
		p1.exchange=767;
		p1.number=8900;
		
		System.out.println("My number is ("+p1.area_code+") "+p1.exchange+"-"+p1.number);
		p2.display();
		
		sc.close();
	}

}

