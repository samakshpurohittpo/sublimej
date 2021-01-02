/**import java.util.*;
 class rbi{
 	Scanner sc=new Scanner(System.in);

 	//int withdraw;
 	void atm(){
       //this.withdraw=withdraw;
       System.out.println("if u need to print money than type yes or no");

       String w=sc.next();
       switch(w){
       case "yes":
       	System.out.println("your money will out through outbox");
       
       case "no":
       	System.out.println("sorry");
       
   
 	}

 }
 public class RBI{
 	public static void main(String[] args) {
 		Scanner sc=new Scanner(System.in);
 		System.out.println("are you Sbi than press 1 or Hdfc than press 2");
 		int j=sc.nextInt();
 		rbi obj=new rbi();
 		if(j==1){
            System.out.println("welcom to Sbi");
            obj.atm();

 		}else if(j==2){
 			System.out.println("welcome to Hdfc");
             obj.atm();
 		}
 		else{
 			System.out.println("sorry u DON'T have bank ACCOUNT");
 		}
 		
 	
}}
 **/
import java.util.*;
import java.lang.*;
 class rbibranch
 {
 	

 	void atm(int p)
 	{
 		Scanner sc=new Scanner(System.in);
       System.out.println("if u need to print money than type yes or no");
       System.out.println("sbi"+p);

       String w=sc.next();
       switch(w){
       case "yes":
       	System.out.println("your money will out through outbox");
       
       case "no":
       	System.out.println("sorry");
       }
   
 	}


 	void atm(String p)
 	{
       System.out.println("if u need to print money than type yes or no");
       System.out.println("hdfc"+p);
 	Scanner sc=new Scanner(System.in);
       String w=sc.next();
       switch(w)
       {
       case "yes":
       	System.out.println("your money will out through outbox");
       
       case "no":
       	System.out.println("sorry");
       
   
 	}

 }
}
 class RBI
 {
 	public static void main(String[] args)
 	 {
 		Scanner sc=new Scanner(System.in);
 		System.out.println("are you Sbi than press 1 or Hdfc than press 2");
 		int j=sc.nextInt();
 		rbibranch obj=new rbibranch();
 		switch(j){

 		case 1:
            System.out.println("welcom to Sbi");
            obj.atm(4);
            break;
 		
 		
 		case 2:
 			System.out.println("welcome to Hdfc");
             obj.atm("samaksh");
 		     break;
 		
 	    default:
 			System.out.println("sorry u DON'T have bank ACCOUNT");
 		    break;
 		
 	}
}
}
 