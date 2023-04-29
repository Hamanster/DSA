package Problem_4;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Product[] p=new Product[5];
        for(int i =0;i<p.length;i++){
            System.out.println("Enter the product id and price");
            p[i]=new Product(sc.nextInt(),sc.nextDouble());
            p[i].display();
        }
        System.out.println(Product.tot_price);
    }
}
