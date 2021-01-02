import java.util.*;
class conversion{
	public static void main(String[] args) {
		int i;

		char [] hexa=new char[100];

		Scanner sc=new Scanner(System.in);

		i=sc.nextInt();
             int ksh=0;
             while(i!=0){
               
              int j=0;  

               j=i%16;

              if(j<10){
                 
                  hexa[ksh]=(char)(j+48);
              	ksh++;
              	
              }
              else{
              	
                hexa[ksh]=(char)(j+55);
              	ksh++;
              	            }
              	  
              	   i=i/16;
		}
         for(int sam=ksh-1;sam>=0;sam--){
         	System.out.print(hexa[sam]);
         }


	}
}