import java.util.*;
class leapyear{
	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		int i,j,k=SC.nextInt();
		//for(i=k;i<=2020;i++){
		if(k%4==0){
			System.out.println("is a leap year"+k);
		}else{
			System.out.println("not a leap year"+k);
		}
	}
}