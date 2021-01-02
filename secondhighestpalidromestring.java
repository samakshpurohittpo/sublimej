import java.util.*;
class secondhighestpalidromestring{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String s1[]=new String[a];
        for(int i=0;i<a;i++)
		s1[i]=sc.next();
      /**  for(int k=0;k<a;k++){
        	if(k[0]<=k[a]){
        		s1[k]
        	}
        }**/

int e[]=new int [a];

	    for(int j=0;j<a;j++){
	    	//System.out.println(s1[j]);
	    	int f=s1[j].length();
	    	System.out.println(f);
	    	e[j]=f;
	    	
	    }
Arrays.sort(e);
	    System.out.println("my answer : "+e[e.length-2]);
	}
}