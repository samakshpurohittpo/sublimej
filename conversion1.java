import java.util.*;
class conversion1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int a[]=new int[i];
		int k=0;
		while(i>0){

            a[k++]=i%2;
            i/=2;}
			//System.out.print(a[k]);
        for(int s=k-1;s>=0;s--)
		System.out.print(a[s]);
	}
}