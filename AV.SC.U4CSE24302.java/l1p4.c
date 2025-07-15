#include<stdio.h>
int main(){
int n1,n2,ans,op;
printf("Enter values of n1,n2");
scanf("%d,%d",&n1,&n2);
printf("1.Addition");
printf("2.Subtraction");
printf("3.Multiplication");
printf("4.Division");
printf("Enter number for operation");
printf("%d",&op);
switch(op)
{
case 1: ans= n1+n2;
printf("%d+%d=%d",n1,n2,ans);
break;
case 2: ans= n1-n2;
printf("%d-%d=%d,n1,n2,ans");
break;
case3: ans= n1*n2;
printf("%d*%d=%d,n1,n2,ans");
break;
case 4: ans=n1/n2;
printf("%d/%d=%d,n1,n2,ans");
break;
default:printf("Invalid operation");
}
return 0;
}
