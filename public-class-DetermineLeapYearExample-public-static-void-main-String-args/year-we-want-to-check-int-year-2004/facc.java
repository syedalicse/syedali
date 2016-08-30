import java.util.Scanner;
 
class Fact
{
   public static void main(String args[])
   {
      int nb, c1, f = 1;
 
      System.out.println("Enter an integer to calculate it's factorial");
      Scanner in = new Scanner(System.in);
 
      n = in.nextInt();
 
      if ( nb < 0 )
         System.out.println("Number should be non-negative.");
      else
      {
         for ( c1 = 1 ; c1 <= nb ; c1++ )
            f = f*c;
 
         System.out.println("Factorial of "+nb+" is = "+f);
      }
   }
}
