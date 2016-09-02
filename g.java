import java.io.*;
import java.util.*;
class G
{
public static void main(String[] args)
{
int i,j,k;
Scanner in=new Scanner(System.in);
System.out.println("Enter three values");
i=in.nextInt();
j=in.nextInt();
k=in.nextInt();
if(i>j&&i>k)
{
System.out.println(i+" is greatest");
} 
else if(j>i&&j>k)
{
System.out.println(j+" is greatest");
}
else if(k>i&&k>j)
{
System.out.println(k+" is greatest");
}
}
}
