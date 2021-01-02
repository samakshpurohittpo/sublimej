import java.util.*;
class Armstrongnumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,d=0,e;
		a=sc.nextInt();
		b=a;
		while(a>0){
			c=a%10;
			d=d+(c*c*c);
			a=a/10;
		}
		if(b==d){
			System.out.println("Armstrongnumber");
		}
		else{
			System.out.println("not a Armstrongnumber");
		}
	    //System.out.println(a);
	}
}