    import java.util.Scanner;

class Stack {
    static int MAX = 5;
    static int stack[] = new int[MAX];
    static int top = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, value;

        System.out.println("1.Push");
        System.out.println("2.Pop");
        System.out.println("3.Peek");
        System.out.println("4.Display");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:   // PUSH
                if (top == MAX - 1) {
                    System.out.println("Stack Overflow");
                } else {
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    top++;
                    stack[top] = value;
                    System.out.println("Value pushed");
                }
                break;

            case 2:   // POP
                if (top == -1) {
                    System.out.println("Stack Underflow");
                } else {
                    System.out.println("Popped value = " + stack[top]);
                    top--;
                }
                break;

            case 3:   // PEEK
                if (top == -1) {
                    System.out.println("Stack is empty");
                } else {
                    System.out.println("Top element = " + stack[top]);
                }
                break;

            case 4:   // DISPLAY
                if (top == -1) {
                    System.out.println("Stack is empty");
                } else {
                    System.out.println("Stack element = " + stack[top]);
                }
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}

