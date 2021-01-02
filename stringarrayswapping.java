import java.util.*;
class stringarrayswapping{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int z,i=sc.nextInt();
		String s[]=new String[i];
		String a[]=new String[i];
		for(z=0;z<i;z++)
			s[z]=sc.next();
		for(z=0;z<i;z++)
			a[z]=sc.next();
		for(z=0;z<i;z++)
			System.out.print(s[z]);
		System.out.println();
		for(z=0;z<i;z++)
			System.out.print(a[z]);

	}
}