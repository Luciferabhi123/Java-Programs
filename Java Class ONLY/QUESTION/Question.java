
/*WAP to implement a clas in which a method is defined where we have to passed an integer type array of size 7 and such method will
multiply each element by 7 that is divisible by 7 otherwise it will subtract by 7. Show the changes after function call and before 
call*/

public class Question {
    public void modifyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 7 == 0) {
                arr[i] *= 7; // Multiply by 7 if divisible by 7
            } else {
                arr[i] -= 7; // Subtract 7 otherwise
            }
        }
    }

    public static void main(String[] args) {
        Question question = new Question();
        int[] array = { 1, 7, 14, 3, 21, 5, 28 };

        System.out.println("Before modification:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        question.modifyArray(array);

        System.out.println("After modification:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
