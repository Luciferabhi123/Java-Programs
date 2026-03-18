
    import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ask user for the size of the array
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // Input elements from user
        System.out.println("Enter " + size + " elements:");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Tracking elements: Displaying index and value
        for(int i=0;i<arr.length;i++){
            System.out.println("Element at index " + i + ": " + arr[i]);
        }

        // Tracking a specific element (Linear Search)
        System.out.print("Enter value to search: ");
        int searchVal = sc.nextInt();
        int foundIndex = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == searchVal) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Element found at index: " + foundIndex);
        } else {
            System.out.println("Element not found.");
        }
    }
}
