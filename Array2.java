import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();
        int[] A = new int[size];

        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }

    }
}
