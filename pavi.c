#include<stdio.h>
void main()
{
    int arr1[1000],n,l,i,j,k,temp,flag=0,rep[1000],inc=0,check[1000];
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
        rep[i]=arr1[i];
    }
    for(i=0;i<n;i++)
    {
        flag=0;
        temp=arr1[i];
        for(j=i+1;j<n;j++)
        {
            if(temp == arr1[j])
            {
               flag=1;
               arr1[j]=0;
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
