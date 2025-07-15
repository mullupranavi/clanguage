#include<stdio.h>
int main(){
int n1,n2;
printf("Enter value of n1");
scanf("%d",n1);
printf("Enter the value of n2");
scanf("%d",n2);
if(n1!=n2){
printf("Both numbers are not equal");
}
if(n1>n2){
printf("n1 is greater than n2");
}
else{
printf("n2 is greater than n1");}
return 0;
}
