package Problem_3;

import java.util.Scanner;

public class Student {
	int Roll;
	String Name;
	double DSA_MARK;
	
	 Student(){
		 Scanner sc =new Scanner (System.in);
		 System.out.println("Enter the Roll number : ");
		 Roll=sc.nextInt();
		 System.out.println("Enter the Name : ");
		 Name=sc.nextLine();
		 System.out.println("Enter Student's DSA Marks : ");
		 DSA_MARK=sc.nextDouble();
		 sc.close();
	 }
	 void showdata() {
		 System.out.println("Name : "+Name);
		 System.out.println("Roll : "+Roll);
		 System.out.println("DSA Marks : "+DSA_MARK);
	 }
	 //wap to add 2 time objects where time is represented as 
	 //distance object
	 
	 
}
