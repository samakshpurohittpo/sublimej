import java.util.*;
class surfaceareaandvolumeofacone{
	public static void main(String[] args) {
		double pi=3.14;
        Scanner sc= new Scanner (System.in);
		double r,s,h;
		r=sc.nextDouble();
		s=sc.nextDouble();
		h=sc.nextDouble();
		double se,vc;
		se=(pi*(r*s))+(pi*r*r);
	    System.out.print("Surfaceareaofcone="+se);
	    vc=(pi*r*r*h);
	    System.out.print("volumeofcone"+vc); 

}}
//Surface area of a cone = πrs + πr2
//Volume of a cone = 1/3πr2h.