
class reverse{
	public static void main(String[] args) {
		String s="samaksh";
		//char ch=s.charAt();
		char[] ch=s.toCharArray();
		for(int i=0;i<=ch.length;i++){  
		if (ch[i]==ch[i+1]&&ch[i]==ch[i+2]){
           System.out.print("hey");
		} else{
			System.out.print(ch[i]);
		}
	}
}}