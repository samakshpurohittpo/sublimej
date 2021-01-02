import java.lang.*;
import java.util.*;
class factorial{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,fact=1;
		num=sc.nextInt();
		for(int i=num;i>1;i--){
           fact=fact*i;
		}System.out.print(fact);
	}
}