import java.util.*;
class pattern{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int o=1,j=sc.nextInt();
		for(int i=0;i<=j;i++){
			for(int k=0;k<=i;k++){
				System.out.print("*");
			}System.out.println();
		}
	}
}