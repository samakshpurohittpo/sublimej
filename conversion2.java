import java.util.*;
class conversion2{
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		int a=0;
		String s=sc.nextLine();

        int valuestoring=0;
        for(int b=s.length()-1;b>=0;b--){
        	//System.out.println(b);
           //System.out.print(s.charAt(b));
           	if(s.charAt(b)=='1'){
                     valuestoring +=1*Math.pow(2,a);
                     
             a++;
           	}
           	else{

             a++;
           	}

        }
        System.out.println(valuestoring);

	}
}
