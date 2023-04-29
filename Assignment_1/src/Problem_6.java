import java.util.Scanner;

public class Problem_6 {
	public static boolean isOdd(int n) {
		while (n>1)
			n-=2;
		if(n==1)
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		if(isOdd(n))
			System.out.println("Yes odd");
		sc.close();
	}

}
