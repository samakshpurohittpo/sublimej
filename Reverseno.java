import java.util.*;
class Reverseno{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b=0,c,d,e;
		a=sc.nextInt();
		c=a;
		while(a>0){
			d=a%10;
			System.out.print(d);
			a=a/10;
		}


	}
}