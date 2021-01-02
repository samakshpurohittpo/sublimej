import java.util.*;
import java.lang.*;
class Array1{
	public static void main(String[] args) {
		int i,j;
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt();
		j=sc.nextInt();
		int Arr[]=new int [i];
		int Arr1[]=new int [j];

		for(int s=0;s<i;s++)
			Arr[s]=sc.nextInt();
		for(int n=0;n<j;n++)
		Arr1[n]=sc.nextInt();
		for(int s=0;s<i;s++)
			System.out.print(Arr[s]);
		System.out.println();
        for(int n=0;n<j;n++)
			System.out.print(Arr1[n]);
		System.out.println();
		int A=Arr.length;
		int B=Arr1.length;
		int C=A+B;
		int Arr2[]=new int[C];
		for(int sam=0;sam<Arr.length;sam++)
			Arr2[sam]=Arr[sam];
		for(int sam=0;sam<Arr1.length;sam++)
			Arr2[Arr.length+sam]=Arr1[sam];
	    for(int sam=0;sam<Arr2.length;sam++)
		   System.out.println(Arr2[sam]);
	}
}