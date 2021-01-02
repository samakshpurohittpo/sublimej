class swapping{
	public static void main(String[] args) {
		int i=5,j=7;
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println("i="+i+"j="+j);
	}
}