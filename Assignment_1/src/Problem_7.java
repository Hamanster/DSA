import java.util.Scanner;
public class Problem_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n= sc.nextInt();
		System.out.println("Enter the values of array :");
		int [] a=new int[n];
		for(int i =0 ;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int max =a[0];
		int min=a[0];
		int p1=0;
		int p2=0;
		int max_o=0;
		int min_o=0;
		for(int i=0;i<n;i++) {
			if(a[i] > max) {
				max = a[i];
				p1=i;
				max_o=1;
			}
			if(a[i] < min) {
				min=a[i];
				min_o=1;
			}
			
			if(a[i]==max)
				max_o++;
			
			if(a[i]==min) {
				min_o++;
				p2=i;
			}
		}
		System.out.println("max : "+max +" time "+ (max_o -1));
		System.out.println("min : "+min +" time "+(min_o -1));
		System.out.println("max position :"+(p1+1));
		System.out.println("min position :"+(p2+1));
		
		sc.close();
	}

}
