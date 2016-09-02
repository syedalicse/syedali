#include <stdio.h>
#include<conio.h>
#include<string.h>
int main(void) 
{
	char str1[100];
	int hash[26]={0},len,i;
	scanf("%s",str1);
	len=strlen(str1);
	for(i=0;i<len;i++)
		hash[str1[i]-'a']++;
	for(i=0;i<len;i++)
	{
			if(hash[str1[i]-'a']>1)
			{
				printf("%c",str1[i]);
				hash[str1[i]-'a']=0;
			}
	}
	return 0;
}
