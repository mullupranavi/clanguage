#include<stdio.h>
void main(){

int a =10;
int *ptr;
ptr = &a;
printf("Address of a variable is : %x",ptr);
printf("\nValue of a variable is %d",*ptr);
}
