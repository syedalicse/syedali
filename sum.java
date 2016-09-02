import java.io.*;
import java.util.*;
class Sum
{
public static void main(String[] args)
{
int nf,s=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the values");
nf=sc.nextInt();
for(int i=1;i<=nf;i++)
{
s=s+i;
}
System.out.println(s);
}
}
