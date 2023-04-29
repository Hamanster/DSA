import java.util.Scanner;
public class Problem_5 {
	public static int sum_Of_Digits(int n) {
		int s=0;
		while(n>0) {
			int r =n%10;
			s=s+r;
			n=n/10;
		}
		
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
		int n =sc.nextInt();
		while(n>9) {
			n= sum_Of_Digits(n);
		}
		System.out.println(n);
	sc.close();
	}
	

}
