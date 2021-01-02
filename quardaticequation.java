import java.util.*;
import java.lang.*;
class quardaticequation{
	public static void main(String[] args) {
		double x,y,z;
		double a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        z=(b*b)-(4*a*c);
        System.out.println("z="+Math.sqrt(z));
        x=(-b+z)/(2*a);
        y=(-b-z)/(2*a);
        System.out.println("jfsj=  "+x);
        System.out.println("jfsj=  "+y);

	}
}