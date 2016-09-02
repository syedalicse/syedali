import java.util.Scanner;
 
class R
{
   public static void main(String args[])
   {
      int n1, rev = 0;
 
      System.out.println("Enter the number to reverse");
      Scanner sc = new Scanner(System.in);
      n1 = sc.nextInt();
 
      while( n1 != 0 )
      {
          rev = rev * 10;
          rev = rev + n1%10;
          n1 = n1/10;
      }
 
      System.out.println("Reverse of entered number is "+rev);
   }
}
