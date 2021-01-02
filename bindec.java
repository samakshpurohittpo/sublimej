import java.util.*;
class bindec{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a=0,b=0,j,i=sc.nextInt();
		while(i!=0){
			j=i%10;
			 a+=(j*Math.pow(2,b));
			i/=10;
		b++;
		}
		System.out.print(a);
	}
}