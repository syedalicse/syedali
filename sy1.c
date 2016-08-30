#include<stdio.h>
#include<string.h>
void main()
{
int d,e,f;
clrscr();
scanf("%d%d%d",&d,&e,&f);
if((d>e)&&(d>f))
printf("d is Largest");
else if((e>f))
printf("e is Largest");
else
printf("f is Largest");
getch();
}
