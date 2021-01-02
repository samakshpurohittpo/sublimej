import java.util.*;
class stringconversion2{
	public static void main(String[] args) {
		String s="sAmAkSh";
		String h="(AEIOUaeiou)";
		String a=s.replaceAll(h,"");
		System.out.print(a);
	}
}//not completed