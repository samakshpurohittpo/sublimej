import java.util.*;
class searchinggreatestvalue{
	public static void main(String[] args) {
		int n1=34,n2=78,n3=99,n4=23;
		//Scanner sc=new Scanner(system.in);
		if((n1>=n2)&&(n1>=n3)&&(n1>=n4))
		 {
			System.out.print("n1="+n1);
		 }
		else if((n2>=n3)&&(n2>=n4)){
			System.out.print("n2="+n2);
		}
		else if(n3>=n4){
			System.out.print("n3="+n3);
		}
		else{
			System.out.print("n4="+n4);
		}
}
}
