import java.util.*;
class thisisforperimeter{
	public static void main(String[] args) {

		System.out.println("1 st for cicle");
		System.out.println("3 nd for rectangle");
		System.out.println("2 rd for traingle");
		Scanner sc =new Scanner(System.in);
		int z=sc.nextInt();
		switch(z){
			case 1:
			double pi=3.14;
			double circle,r;
			r=sc.nextDouble();
			circle=2*(pi*r);
            System.out.println("cicle "+circle);
            break;
            case 3:
			int a,b,c,traingle;
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			traingle=(a+b+c)
			;
            System.out.println("traingle "+traingle);
            break;
            case 2:
			int l,w,rectangle;
			l=sc.nextInt();
			w=sc.nextInt();
			rectangle=2*(l+w);
            System.out.println("rectangle "+rectangle);
            break;
		} 
	}
}