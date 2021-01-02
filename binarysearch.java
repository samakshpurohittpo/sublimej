class binarysearch{
      public static void binarysear(int a[],int first,int length,int b )
      {
       	
     while(first<=length)
     {
     	int mid=(first+length)/2;
     	if(a[mid]<b)
     	{
     		
     first=mid+1;
     	}
     	else if(a[mid]==b)
     	{
     		System.out.println("succes");
     		break;
     	}
     	else
     	{
     		length=mid-1;
     	}
        
       //mid=(first+length)/2;
     }
    // return 0;

   }






	public static void main(String[] args) {
		
	int a[]={2,3,4,5,6,7,8,9};
	int b=6 ;
	int length=a.length-1;
	//for (int b=0;b<a.length;b++){
	// if()                                //	System.out.println(a[b]);}
	binarysear(a,0,length,b);
	}
}