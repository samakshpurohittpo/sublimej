import java.util.*;
/**class Bubblesort{
	Bubblesort{}
	Bubblesort(int arr[]){
		int i,j;
	}
}**/




class bubblesorting{
	public static void main(String[] args) {
		//int arr[]={7,8,6,10};
		Scanner hc=new Scanner(System.in);
		int u=hc.nextInt();
		int arr[]=new int [u];
		int sc=0;
      // Bubblesort bs=n(arr);
       for(int i=0;i<u;i++){
       	arr[i]=hc.nextInt();
       //	System.out.println(arr[i]);
       }


		for(int i=0;i<u;i++){
			for(int j=0;j<u-1;j++){
				if(arr[j]>arr[j+1]){
                    sc=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=sc;
				}
			}

		}
		for(int k=0;k<u;k++){
			System.out.print(arr[k]);
		}
	}
}