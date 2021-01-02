import java.util.*;
class matrixdigonal{
	Scanner sc =new Scanner(System.in);
    int p,q,digonal=0;    
	int a[][];

	matrixdigonal(){
		p=sc.nextInt();
		q=sc.nextInt();
		int a[][]=new int [p][q];
		for(int i=0;i<p;i++){
			for(int j=0;j<q;j++){
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<p;i++){
			for(int j=0;j<q;j++){
               if(i==j){
              digonal+=a[i][j];
               }
			}
		}
       System.out.print(digonal);

	}

}
class digonal{
	public static void main(String[] args) {
		matrixdigonal md=new matrixdigonal();
	
	}
}