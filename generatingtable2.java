import java.util.*;
import java.lang.*;
class gettingvalue{
	int roll,mob;
	String name;
	gettingvalue(int roll,int mob,String name){
		this.roll=roll;
		this.mob=mob;
		this.name=name;
	//System.out.print("hey");
	}
	void display(){
		System.out.println("roll="+roll+"\nmob="+mob+"\nname="+name);
	}
}

public class generatingtable2{
	public static void main(String[] args) {
		gettingvalue gv=new gettingvalue(442,4425,"samaksh");
		gv.display();//(442,4425,"samaksh");
		
		System.out.print("hello");
	}
}