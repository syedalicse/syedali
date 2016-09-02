#include<stdio.h>
int main(){
  int n,n2,x1,y1;
  printf("\nEnter two numbers:");
  scanf("%d %d",&n,&n2);
  x1=n,y1=n2;
  while(n!=n2){
      if(n>n2)
           n=n-n2;
      else
      n2=n2-n;
  }
  printf("L.C.M=%d",(x1*y1)/n);
system("pause");
}
