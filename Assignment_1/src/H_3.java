import java.util.Scanner;

public class H_3 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int n= sc.nextInt();

        int[] a=new int[n];
        int[] b= new int[n];
        int[] c= new int[n];

        System.out.println("Enter the elements of the 1st array :");

        for(int i =0;i<n;i++)
            a[i]=sc.nextInt();

        for(int i =0;i<n;i++)
            b[i]= sc.nextInt();

        for(int i =0;i<n;i++)
            c[i]=a[i]*b[i];

        for (int i :c)
            System.out.println(i);
        sc.close();
    }
}
