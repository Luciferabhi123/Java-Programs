public class Nested_Static_Class {
    
    static int a,b;
    static class Faculty {

        int c;
        public void show() {
            System.out.println("Within Show");
        }
    }

    public static void main(String[] args) {
        // To instantiate a static nested class, you do not need an instance of the outer class.
        Nested_Static_Class.Faculty ob = new Nested_Static_Class.Faculty();
        ob.show();
    }
}
