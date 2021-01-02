import java.util.*;
class Strongnumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,d,e=1,f=0;
		a=sc.nextInt();
		b=a;
		while(a>0)
		{   e=1;
			c=a%10;
			for(d=c;d>=1;d--)
			{
				e=e*d;
				
			}
			f=f+e;
				
			a=a/10;
		}
		System.out.println(f);
		
		
	}
}