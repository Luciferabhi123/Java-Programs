import java.util.Scanner;

public class Push {

    static final int MAX = 100;
    int top;
    int[] a = new int[MAX];

    Push() {
        top = -1;
    }

    boolean isEmpty() {
        return (top < 0);
    }

    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    public static void main(String[] args) {
        Push s = new Push();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements to push: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            s.push(sc.nextInt());
        }
    }
}

    
