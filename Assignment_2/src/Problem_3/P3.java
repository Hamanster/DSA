package Problem_3;

public class P3 {

	public static void main(String[] args) {
		Student[] s=new Student[5];
		double max=0.0;
		int index=0;
		for(int i =0;i<s.length;i++){
			s[i]=new Student();
			if(s[i].DSA_MARK>max){
				max=s[i].DSA_MARK;
				index=i;
			}

		}
		s[index].showdata();


	}

}
