public class Rev {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		str=sc.next();
		int jo=str.length();
		jo--;
		char str1[]=str.toCharArray();
		char temp;
		for(int i=0;i<str1.length/2;i++){
			temp=str1[i];
			str1[i]=str1[jo];
			str1[jo]=temp;
			jo--;
		}
		str=new String(str1);
		System.out.println(str);

	}

}
