package Problem_2;

public class Complex {
	int real;
	int img;
	Complex(int real,int img){
		this.real=real;
		this.img=img;
	}
	Complex(){
		
	}
	
	public Complex add(Complex c1,Complex c2) {
		Complex temp = new Complex();
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
		return temp;
	}
	
	void display(){
		System.out.println(real+" + i"+img);
	}
}
