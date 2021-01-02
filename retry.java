import java.util.*;
class swappingstring{
	String r;
	swappingstring(String j,String k){
      r=j;
      j=k;
      k=r;

    System.out.print(j);
    System.out.print(k);
	}
}
class retry{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//int p,q;
	String s,a;
	s=sc.next();
	a=sc.next();
	//System.out.print(s);
    swappingstring ss=new swappingstring(s,a);
	}
}