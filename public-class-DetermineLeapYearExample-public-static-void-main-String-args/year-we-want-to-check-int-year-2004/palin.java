import java.util.*;
 
class Palindrome
{
   public static void main(String args[])
   {
      String o, r = "";
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a string to check if it is a palindrome");
      original = in.nextLine();
 
      int len = o.len();
 
      for ( int i = len - 1; i >= 0; i-- )
         r = r + o.charAt(i);
 
      if (o.equals(r))
         System.out.println("Entered string is a palindrome.");
      else
         System.out.println("Entered string is not a palindrome.");
 
   }
}
