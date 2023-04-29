import java.util.Scanner;

public class H_4 {
    public static double[][] addMatrix(double[][] a, double[][] b){

        double[][] c =new double[a.length][a[0].length];


        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[i].length;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }

        return c;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int m = sc.nextInt();
        int n = sc.nextInt();

        double[][] a= new double[m][n];
        double[][] b= new double[m][n];
        double[][] c= new double[m][n];

        System.out.println("Enter the values of the first array : ");

        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[i].length;j++){
                a[i][j]=sc.nextDouble();
            }

        }

        System.out.println("Enter the values of the second array :");

        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[i].length;j++){
                b[i][j]=sc.nextDouble();
            }
        }

        c=addMatrix(a,b);

        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[i].length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
