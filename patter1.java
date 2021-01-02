import java.util.*; 
class patter1{
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int j=sc.nextInt();
    
    	for(int i=j-1;i>=1;i--){
    		for(int k=1;k<=i;k++){
    			System.out.print("*");
    		}System.out.println();
    	}
}
}