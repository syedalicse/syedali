#include<stdio.h>
int main()
{
int i,nf,fl=0;
printf("enter a number positive one ")
scanf("%d",&nf);
 
for(i=2;i<nf;i++)
{
if(nf%i==0)
{
fl=1;
}
}
if(fl==0)
printf("the number is prime");
else
printf("the number is not a prime");
return 0;
}
