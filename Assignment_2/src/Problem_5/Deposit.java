package Problem_5;

public class Deposit {
    long Principal;
    int time=1;
    double rate=10;
    static double Total_amt;
    Deposit(){

    }
    Deposit(long Principal , int time,double rate){
        this.Principal=Principal;
        this.time=time;
        this.rate=rate;
    }
    Deposit(long Principal , int time){
        this.Principal=Principal;
        this.time=time;
    }
    Deposit(long Principal , double rate){
        this.Principal=Principal;
        this.rate=rate;
    }

    void display(){
        System.out.println("Principal : ₹"+Principal);
        System.out.println("Time : "+time +" years");
        System.out.println("Rate : "+rate+"%");
        calc_amt();
        System.out.println("Total amount : ₹"+Total_amt);

    }
    void  calc_amt(){
        Total_amt=Principal+((Principal*rate*time)/100);
    }


}
