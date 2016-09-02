public class r
{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str;
		str=s.next();
		int j=str.length();
		j--;
		char str1[]=str.toCharArray();
		char temp;
		for(int i=0;i<str1.length/2;i++){
			temp=str1[i];
			str1[i]=str1[j];
			str1[j]=temp;
			j--;
		}
		str=new String(str1);
		System.out.println(str);

	}

}
