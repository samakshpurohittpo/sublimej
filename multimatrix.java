import java.util.*;
class multimatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int q=sc.nextInt();
		int a[][]=new int[p][q];
		int b[][]=new int[p][q];
		for(int s=0;s<p;s++){
			for(int t=0;t<q;t++){
				a[s][t]=sc.nextInt();
			}
		}

         for(int s=0;s<p;s++){
			for(int t=0;t<q;t++){
				b[s][t]=sc.nextInt();
			}
		}
       for(int s=0;s<p;s++){
			for(int t=0;t<q;t++){
				System.out.print(a[s][t]);
			}System.out.println();
		}

         for(int s=0;s<p;s++){
			for(int t=0;t<q;t++){
				System.out.print(b[s][t]);
			}System.out.println();
		}


       int c[][]=new int [p][q];
       for(int s=0;s<p;s++){
       	for(int t=0;t<q;t++){

       
       c[s][t]=a[s][t]*b[s][t];
       System.out.print(c[s][t]);
}System.out.println();
}
	}
}
