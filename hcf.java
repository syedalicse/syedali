import java.io.*;
class H
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the First no : ");
            int n1=Integer.parseInt(b.readLine());
            System.out.print("Enter the Second no : ");
            int n2=Integer.parseInt(b.readLine());
            int h=0;
            int min = Math.min(n1,n2);
             
            for(int i=min; i >= 1; i--)
            {
                if(n1%i == 0 && n2%i == 0)
                {
                    h = i;
                    break;
                }
            }        
            System.out.print("\nThe hcf of "+n1+" and "+n2+" = "+h);
        }
    }
