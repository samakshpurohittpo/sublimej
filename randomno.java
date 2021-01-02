import  java.util.*;
class randomno{
	public static void main(String[] args) {
		Random sam=new Random();
		Scanner sc=new Scanner(System.in);
		int samaksh,neha=sc.nextInt();
		//float i;
		//while(true){
		for (float i=1;i<=neha;i++){
        samaksh=sam.nextInt(5);
			System.out.println(i);
		}
	}
}