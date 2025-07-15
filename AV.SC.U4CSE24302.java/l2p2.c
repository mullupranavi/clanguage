#include<stdio.h>

int main(){
    int l,b;
    float area;
    printf("Enter two numbers");
    scanf("%d%d",&l,&b);
    area=(float)l*b;
    printf("area of rectangle = %.2f",area);
    return 0;
}

