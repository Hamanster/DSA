import java.util.Scanner;

public class H_2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array : ");

        String [] a =new String[sc.nextInt()];

        System.out.println("Enter the values of the array: ");

        sc.nextLine();

        for (int i =0;i<=a.length;i++){
            a[i]=sc.nextLine();
        }

        int i =0;
        int j=a.length-1;

        while(j>i){
            String t= a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
        }

        for (String s : a) System.out.println(s);
        
        sc.close();
    }
}
