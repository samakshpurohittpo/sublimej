import java.util.*;

class fibonnicno{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0,e=1,s,a;
		int j=sc.nextInt();
		System.out.println(n+"  "+e);
        
        for(int i=2;i<=j;i++){
        s=n+e;
         System.out.print(s);
        n=e;
        e=s;
        
         
        }
			}
       

}

