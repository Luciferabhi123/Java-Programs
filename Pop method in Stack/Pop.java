class Pop {
    static final int MAX = 5;
    static int stack[] = new int[MAX];
    static int top = -1;

    static void push(int value) {
        if (top == MAX - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
        }
    }

    static void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            int popped = stack[top];
            top--;
            System.out.println(popped + " popped from stack");
        }
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);

        pop();
        pop();
    }
}
