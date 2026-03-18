#include <stdio.h>
#define Max 5

int stack[Max];
int top = -1;

void push(int vlaue)
{
    if(top == Max - 1)
    {
        printf("Stack Overflow\n");
    }
    else
    {
        top++;
        stack[top]=value;
        printf("%d pushed into stack\n",value);
    }

}

int main()
{
    push(10);
    push(20);
    push(30);
    return 0;
}