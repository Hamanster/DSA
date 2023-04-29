import java.util.Scanner;
public class Problem_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int sum=0;
		int pro=1;
		while(n>0) {
			int r = n%10;
			sum += r;
			pro *= r;
			n/=10;
			
		}
		if(sum == pro) 
			System.out.println("Yes, its a spy number");
		else 
			System.out.println("No, not a spy number");
		
		sc.close();
	}

}
