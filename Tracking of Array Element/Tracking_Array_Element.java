public class Tracking_Array_Element {
    public static void main(String[] args) {
                int []arr ={10,20,30,40,50};

        // Tracking elements: Displaying index and value
        for(int i=0;i<arr.length;i++){
            System.out.println("Element at index " + i + ": " + arr[i]);
        }

        // Tracking a specific element (Linear Search)
        int searchVal = 30;
        int foundIndex = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == searchVal) {
                foundIndex = i;
                break;
            }
        }
        
        if(foundIndex != -1)
            System.out.println("Element " + searchVal + " found at index: " + foundIndex);
        else
            System.out.println("Element " + searchVal + " not found.");
    }
    
}
