package Problem_1;

class Phone {
	
	int area_code;
	int exchange;
	int number;
	Phone(){
		
	}
	Phone(int area_code , int exchange, int number){
		this.area_code=area_code;
		this.exchange=exchange;
		this.number=number;
		
	}
	
	void display(){
		System.out.println("Your number is ("+area_code+") "+exchange+"-"+number);
	}
}