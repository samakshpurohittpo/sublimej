import java.util.*;
 class checkingsumnuber{
	public static void main(String[] args)
	 {
		Scanner sc=new Scanner(System.in);
		int a,b,c=0,d=0;
		a=sc.nextInt();
		for(b=1;b<a;b++)
		{
			if(a%b==0){
				c=c+b;
			System.out.println(b);
			}
		}
		if(c==a){
			System.out.println("perfect");

		}
		else{
			System.out.println("not a perfect");
		}
		//System.out.println(a);

	}
}