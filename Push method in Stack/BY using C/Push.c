#include <stdio.h>
#define MAX 5

int stack[MAX]; // Array to hold stack elements
int top = -1;   // Initialize top to -1 indicating the stack is empty

void push(int value)
{
    if (top == MAX - 1) // Check for stack overflow
    {
        printf("Stack Overflow\n");
    }
    else
    {
        top++; // Increment top to point to the next empty position
        stack[top] = value; // Add the new value to the stack
        printf("%d pushed into stack\n", value); // Confirmation message
    }
}

int main()
{
    push(10); // Push 10 onto the stack
    push(20); // Push 20 onto the stack
    push(30); // Push 30 onto the stack

    return 0; // End of the program
}
