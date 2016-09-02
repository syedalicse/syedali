import java.util.Scanner;

public class pan {
              public static void main(String[] args)
              {
				Scanner sc=new Scanner(System.in);
				String s=sc.nextLine();
				int a=s.length();
				char c[]=new char[a];
				c=s.toCharArray();
				String s1="abcdefghijklmnopqrstuvwxyz";
				int r=s1.length();
				char c1[]=new char[r];
				c1=s1.toCharArray();
				char b;
				int temp=0;
				for (int i = 0; i < c.length; i++)
				{
					for(int j=0;j<r;j++)
					{
						if(c[i]==c1[j])
						{
						temp++;
						}
					}
				}
				if(temp==r)
				{
					System.out.println("It is a pangram");
				}
				else
				{
					{
						System.out.println("It is not a pangram");
					}
				}
			}
}
