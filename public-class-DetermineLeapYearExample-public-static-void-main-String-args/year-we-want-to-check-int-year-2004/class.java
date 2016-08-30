import java.util.*;
  
 class Reverse
 {
    public static void main(String args[])
    { int ab,bn,k;
       
       Scanner in = new Scanner(System.in);
  ab= in.nextInt();
  bn= in.nextInt();
      
      for (  k =ab+1; k <bn ; k++ )
       {
           if(k%2==0)
      System.out.print(" "+k);
       }
       
    }
 }
