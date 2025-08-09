#include<stdio.h>
void main(){
    int a = 10;
    void *p1 = &a;
    float f = 2.5;
    void *p2 = &f;
    printf("The value of a is : %d\n", *(int*)p1);
    printf("The Address of a is %x\n", p1);
    printf("The value of f is : %f\n", *(float*)p2 );
    printf("Address of f is:%x", p2);
}

