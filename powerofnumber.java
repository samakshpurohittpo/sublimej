import java.util.*;
class powerofnumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c=1;
		System.out.println("this programme for find the power of no");
		System.out.println("please enter the base");
		a=sc.nextInt();
		System.out.println("please enter the power");
		b=sc.nextInt();
		while(b!=0)
		{
	
				c=c*a;
				b--;
			}
			System.out.print(c);
		
	}
}