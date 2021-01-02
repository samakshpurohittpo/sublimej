import java.util.*;
class genricrootofnumber{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=0,c;
		System.out.println(n);
		while( n!=0){
			a=0;
			int j=n%10;
			a=j;
			b=b+a;
			n=n/10;
		}System.out.print(b);
		
	}
}