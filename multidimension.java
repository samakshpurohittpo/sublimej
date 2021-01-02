import java.util.*;
class multidimension{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]={1,2,3,4,5,6};
		int a,b,sum=0;
        //int c=arr.length;
		//int k[]=new int [c];
		a=sc.nextInt();
		b=sc.nextInt();
			for(int j=a;j<=b;j++){
				sum+=arr[j];
					
			}
			System.out.println(sum);
			
		

	}
}