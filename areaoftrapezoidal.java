import java.util.*;
class areaoftrapezoidal{
	public static void main(String[] args) {
		double a,b,h;
		Scanner sc= new Scanner (System.in);
		a=sc.nextDouble();
		b=sc.nextDouble();
		h=sc.nextDouble();

		double c=(a+b)*h/2;
		System.out.print("c"+c);

	}
}