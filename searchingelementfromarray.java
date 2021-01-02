import java.util.*;
class searchingelementfromarray{
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		int n=sc.nextInt();
		int a[]=new int [n];
		for(int b=0;b<n;b++){
			a[b]=sc.nextInt();
		}
		int j=sc.nextInt();
		for(int b=0;b<n;b++){
			if (a[b]==j){
				System.out.print(b);
				System.out.print(a[b]);
			}
		}
	}
}