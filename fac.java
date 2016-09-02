public class f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,c,fact=1;
Scanner s = new Scanner(System.in);
n=s.nextInt();
if(n < 0)
	System.out.println("you entered non negative");
else 
	for(c=1;c<n;c++)
	{
		fact = fact*c;
		System.out.println("factorial "+n+"is ="+fact);
		
	}
	

	}

}
