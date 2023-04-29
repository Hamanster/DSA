import java.util.Scanner;
public class Problem_10 {

	public static double sumColumn(double[][] m, int columnIndex){

		double sum=0;

		for(int i=0; i<m.length;i++){

			sum+=m[i][columnIndex];

		}

		return sum;

	}

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);

		System.out.println("Enter the size of the array : ");
		int m =sc.nextInt();
		int n =sc.nextInt();

		double [][] a= new double[m][n];

		System.out.println("Enter the elements of the array : ");

		for (int i=0;i<m;i++){
			for (int j =0 ;j<n ;j++){

				a[i][j]=sc.nextDouble();

			}
		}

		for (int i=0;i<n;i++){

			System.out.println("Sum of the elements at column "+ n+" is "+sumColumn(a,i));

		}

	}

}
