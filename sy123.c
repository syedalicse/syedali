#include<stdio.h>
#include<conio.h>
#include<string.h>
#include<stdlib.h>
 
void main()
{
 
 int *f,l,i,j,k;
 char *rom;
 
 clrscr();
 
 printf("Enter the Roman Numeral:");
 scanf("%s",rom);
 
 l=strlen(rom);
 
 for(i=0;i<len;i++)
 {
  if(rom[i]=='I')
   f[i]=1;
  else if(rom[i]=='V')
   f[i]=5;
  else if(rom[i]=='X')
   f[i]=10;
  else if(rom[i]=='L')
   f[i]=50;
  else if(rom[i]=='C')
   f[i]=100;
  else if(rom[i]=='D')
   f[i]=500;
  else if(rom[i]=='M')
   f[i]=1000;
  else
  {
   printf("\nInvalid Value");
   getch();
   exit(0);
  }
 }
 k=f[l-1];
 for(i=l-1;i>0;i--)
 {
  if(f[i]>f[i-1])
   k=k-f[i-1];
  else if(f[i]==f[i-1] || f[i]<f[i-1])
   k=k+f[i-1];
 }
 printf("\nIts Decimal Equivalent is:");
 printf("%d",k);
 getch();
}
