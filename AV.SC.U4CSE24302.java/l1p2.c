#include<stdio.h>

int main(){
int a,b,c;
a=10;
b=20;
c=5;
if(a>b&&a>c){
    printf("a is greater");
}
else if(b>c&&b>a){
    printf("b is greater");
}
else{
    printf("c is greater");
}
return 0;
}
