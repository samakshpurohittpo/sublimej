import java.util.*;
class hcf{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2,temp1,temp2,temp,hcf=0,lcm;
		num1 =sc.nextInt();
		num2 =sc.nextInt();
		temp1=num1;
		temp2=num2;
		//if(num1>=num2){
		//	System.out.print(num1);
		//}else{}
		temp=num1<num2?num1:num2;
        // System.out.print(temp);
		for(int i=1;i<temp;i++){
			if (num1%i==0&&num2%i==0){
				hcf=i;
			}
		}System.out.print(hcf);

	}
}