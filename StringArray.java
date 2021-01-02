import java.util.*; 
class StringArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int i;
		i=sc.nextInt();
		String a[]=new String [i];
		for(int n=0;n<i;n++){
			a[n]=sc.next();
		}
		for(int n=0;n<i;n++)
			System.out.println(a[n]);



		for(int j=a.length-1;j>=0;j--)
			System.out.println(a[j]);
		/**if (a[n].compareTo(a[j])){
			System.out.print("yes");
		}else{
			System.out.print("work not done of palidrome sting");
		}**/
	}
}


//reverse string