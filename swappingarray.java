import java.util.*;
class swappingarray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int z,i=sc.nextInt();
		int a[]=new int [i];
		int b[]=new int [i];
		for(z=0;z<i;z++)
			a[z]=sc.nextInt();
		for(z=0;z<i;z++)
			b[z]=sc.nextInt();
		for(z=0;z<i;z++)
			System.out.print(a[z]);
		for(z=0;z<i;z++)
		System.out.print(b[z]);	
	for(z=0;z<i;z++){

	a[z]=a[z]+b[z];
	b[z]=a[z]-b[z];
	a[z]=a[z]-b[z];}
		for(z=0;z<i;z++)
			System.out.print(a[z]);
		for(z=0;z<i;z++)
		System.out.print(b[z]);	
	
	}
}