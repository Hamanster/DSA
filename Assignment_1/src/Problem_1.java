import java.util.Scanner;
public class Problem_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the 1st  2d array: ");
		
		int m =sc.nextInt();
		int n =sc.nextInt();
		
		System.out.println("Enter the size of the 2nd 2d array: ");
		
		int m1= sc.nextInt();
		int n1 =sc.nextInt();
		
		if(n!=m1)
			System.out.println("Wrong input!!");
		else {
			int [][] a = new int[m][n];
			int [][] b = new int[m1][n1];
			int [][] c = new int[m][n1];
			
			System.out.println("Enter the value of 1st array : ");
			//input for 1st array
			for(int i =0 ;i<m;i++) {
				for(int j=0;j<n;j++) {
					a[i][j]=sc.nextInt();
				}
			}
			
			System.out.println("Enter the values of the 2nd array");
			//input for 2nd array
			for(int i =0 ;i<m1;i++) {
				for(int j=0;j<n1;j++) {
					b[i][j]=sc.nextInt();
				}
			}
			
			//multiplication
			for(int i =0;i<m;i++) {
				for(int j = 0 ;j<n1;j++) {
					int s =0;
					for(int k = 0;k<m1;k++) {
						s = s + ( a[i][k] * b[k][j]);
					}
					c[i][j]=s;
				}
			}
			
			//print
			for(int i =0 ;i<m;i++) {
				for(int j=0;j<n1;j++) {
					System.out.print(c[i][j] +" ");
				}
				System.out.println();
			}
		}
		sc.close();
		
	}
}

