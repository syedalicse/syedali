#include<stdio.h>
void main()
{
    int arr[1000],n,l,i,j,k,temp,flag=0,rep[1000],inc=0,check[1000];
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
        rep[i]=arr[i];
    }
    for(i=0;i<n;i++)
    {
        flag=0;
        temp=arr[i];
        for(j=i+1;j<n;j++)
        {
            if(temp == arr[j])
            {
               flag=1;
               arr[j]=0;
            }
        }
        if(flag == 1 && temp !=0)
        {
            check[inc]=temp;
            inc++;
        }
    }
    for(i=0;i<n;i++)
    {
        flag=0;
        for(j=0;j<inc;j++)
        {
            if(rep[i] == check[j])
            {
                flag=1;
                break;
            }
        }
        if(flag == 0)
        {
            printf("%d ",rep[i]);
        }
    }
}
