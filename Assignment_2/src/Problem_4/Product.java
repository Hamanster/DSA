package Problem_4;

public class Product {
    static double tot_price;
    int pid;
    double price;
    Product(int pid,double price){
        this.pid=pid;
        this.price=price;
        tot_price+=price;
    }
    void display(){
        System.out.println(pid +"\t"+price);
    }

}
