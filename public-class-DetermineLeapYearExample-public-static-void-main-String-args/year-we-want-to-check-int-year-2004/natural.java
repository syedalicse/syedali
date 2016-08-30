public class Natural 
{
    public static void main(String args[])
    {
        int a, i = 1 ;
        int s1 = 0;
        System.out.println("Enter Number of items :");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        while(i <= a)
        {
            s1 = s1 +i;
            i++;
        }
        System.out.println("Sum of "+a+" numbers is :"+s1);
    } 
}
