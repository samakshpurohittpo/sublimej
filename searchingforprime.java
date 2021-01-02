import java.lang.*;
import java.util.*;
class searchingforprime{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		a=sc.nextInt();
		for(int i=1;i<=a;i++){
          if (a%i==0){
        System.out.println(i); 	
          }//System.out.print(a);
		}
	}
}