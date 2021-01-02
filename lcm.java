import java.util.*;
import java.lang.*;
class lcm{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c=0,temp,temp1,temp2;
		a=sc.nextInt();
		b=sc.nextInt();
		temp1=a;
		temp2=b;
		temp=a>b?a:b;
		while(true){
			if(temp%a==0&&temp%b==0){
             System.out.print(temp);
             break;
              
			}
		++temp;
		}
	}
}