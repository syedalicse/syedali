include <stdio.h>
int main()
{
 int f, c, m=0;
 printf("Enter an integer: ");
 scanf("%d",&f);
 for(c=1;c<=f;++c)  
  {
      m+=c;               
  }
  printf("SUM = %d",m);
  return 0;
}
