import java.util.*;
import java.lang.*;
class Array{
	public static void main(String[] args) {
		/**int Arr[]={1,2,3,4,5,6};
		for(int i=0;i<=Arr.length;i++)
		System.out.print(i);**/
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int Arr[]=new int[n];
		for(int i=0;i<n;i++)
		Arr[i]=sc.nextInt();
		for(int i=0;i<n;i++)	
        System.out.print("   "+Arr[i]);
	}
}