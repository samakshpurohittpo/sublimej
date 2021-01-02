import java.util.*;
class areaoftraingle{
	public static void main(String[] args) {
		int breath,height;
		Scanner sc=new Scanner (System.in);
		breath=sc.nextInt();
		height=sc.nextInt();
		int area;
		area=(breath*height)/2;
		System.out.print("area"+area);
	}
}