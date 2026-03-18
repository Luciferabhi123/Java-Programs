public class Nested_Class {
    
    int a,b;
	class Faculty {

        int c;
		public void show() {
			System.out.println("Within Show");
		}
	}

	public static void main(String[] args) {
		// To instantiate an inner class, you first need an instance of the outer class.
		Nested_Class ob = new Nested_Class();
		// Then, create the inner class instance using the outer class instance.
		Nested_Class.Faculty ob2 = ob.new Faculty();
		ob2.show();
	}
}
