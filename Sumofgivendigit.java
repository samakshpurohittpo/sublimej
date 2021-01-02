import java.util.*;
class Sumofgivendigit{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,d=0;
		a=sc.nextInt();
		//System.out.print(a);
		b=a;
		while(a>0){
		c=a%10;
		//System.out.print(c);
		d=d+c;
		
		a=a/10;}
		System.out.print(d);
	}
}