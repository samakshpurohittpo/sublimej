import java.util.*;
class palidromestring{
	public static void main(String[] args) {
		String str,str1="";
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		int length = str.length();
		for(int i=length-1;i>=0;i--){
			str1=str1+str.charAt(i);
		}if(str.equals(str1))
           System.out.print("ys");
                      else
                      	System.out.print("no");
	}
} 