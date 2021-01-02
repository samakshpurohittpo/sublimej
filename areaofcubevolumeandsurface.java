import java.util.*;
class areaofcubevolumeandsurface{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int s=sc.nextInt();
		int volume=(s*s*s);
		System.out.print("volume"+volume);
		int surfacearea=6*(s*s);
        System.out.print("surfacearea"+surfacearea);

	}
}