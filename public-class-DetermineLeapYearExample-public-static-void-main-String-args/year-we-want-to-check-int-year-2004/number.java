class primeNUMBER
{
public static void main()
{
int i,j,k;
for(i=101;i<10000l;i++) //here you can give your own range
{
         k=0;
         for(j=2;j<i;j++)
         {
                  if(i%j==0)
                  k++;
         }
         if(k==0)
         System.out.print(i+"   ");
}
}
}
