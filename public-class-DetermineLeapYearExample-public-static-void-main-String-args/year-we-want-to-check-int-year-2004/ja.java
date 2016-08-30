import java.util.*;
 import java.lang.*;
 import java.io.*;
 
 
 class Codechef
 {
 	public static void main (String[] args) throws java.lang.Exception
 	{ int n,i,count=0;
 	    Scanner in=new Scanner(System.in);
 	    n=in.nextInt();
 		while(n>0)
 		{
 		    n=n/10;
 		    count++;
 		}
 		System.out.println(count);
 	}
 }
