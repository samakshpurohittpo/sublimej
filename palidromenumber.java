import java.util.*;
class palidromenumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c=0,d,e;
		a=sc.nextInt();
		//d=a;
		//System.out.println(a);
		while(a>0){
			b=a%10;
			c=(c*10)+b;
			a=a/10;
		}
		System.out.println(c);
		
}}