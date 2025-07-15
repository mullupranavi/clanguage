#include<stdio.h>
int main(){
int a,*b;
a=26;
b=&a;
printf("\nValue in a =%d",&a);
printf("\nAddress of a = %x",&a);
printf("\nValue in b = %x",b);
printf("\nPointing value = %d",*b);
return 0;
}
