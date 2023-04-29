import java.util.Scanner;
public class Problem_9 {
	public static double sumMajorDiagonal(double[][] m){

		double sum=0;

		for(int i =0;i<m.length;i++){
			for(int j=0;j<m[i].length;j++){

				if(i==j)
					sum+=m[i][j];
			}
		}

		return sum;
	}

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);

		System.out.println("Enter the size of the square matrix : ");
		int n =sc.nextInt();

		double[][] a =new double[n][n];

		System.out.println("Enter the elements of the matrix : ");

		for(int i =0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j]=sc.nextDouble();
			}
		}
		System.out.println("The sum of the Diagonal is:" + sumMajorDiagonal(a));
		sc.close();
	}

}
