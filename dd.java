public class syed
{
    public static void main(String ar[])throws Exception
{
int n,p,t;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int stack[]=new int[n];
for(int i=0;i<n;i++)
stack[i]=sc.nextInt();
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(stack[i]>stack[j])
{
t=stack[i];
stack[i]=stack[j];
stack[j]=t;
}
}
}
for(int i=0;i<n-1;i++)
{
if(stack[i]==stack[i+1])
{
    i++;
    continue;
}
else
System.out.println(stack[i]);
}

}
