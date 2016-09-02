public class Pc {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String sentence=s.nextLine();
		char[] alp=new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
				'o','p','q','r','s','t','u','v','w','x','y','z'};
		int[] flag=new int[26];
		for(int i=0;i<26;i++) {
			for(int j=0;j<sentence.length();j++) {
				if(alp[i]==sentence.charAt(j)) {
					flag[i]++;
				}
			}
		}
		int count=0;
		for(int i=0;i<26;i++) {
			if(flag[i]>0){
				count++;
			}
		}
		if(count>=26) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		s.close();
	}

}
