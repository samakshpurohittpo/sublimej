import java.lang.*;
import java.util.*;
class ArrangingArrayinAssending{
	public static void main(String[] args) {
		int temp=0,arr[]={1,9,7,5,3};
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
		for(int j=0;j<arr.length;j++){
			for(int k=j+1;k<arr.length;k++){
				if(arr[j]>arr[k])
				{
					temp=arr[j];
					arr[j]=arr[k];
					arr[k]=temp;
				}
			}
		}
		System.out.println();
		for(int j=0;j<arr.length;j++){
			System.out.println(arr[j]);
		}
	}
}