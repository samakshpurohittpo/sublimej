import java.util.*; 
class Again{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int i;
		i=sc.nextInt();
		int a[]=new int [i];
		for(int n=0;n<i;n++){
			a[n]=sc.nextInt();
		}
		for(int n=0;n<i;n++)
			System.out.println(a[n]);



		for(int j=a.length-1;j>=0;j--)
			System.out.println(a[j]);
	}
}