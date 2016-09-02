import java.util.*;
public class number_of_words
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
String s=new String();
s=sc.next();
String q[]=s.split("\\s");
System.out.println("number of words in a given line is:"+q.length);
}
}
