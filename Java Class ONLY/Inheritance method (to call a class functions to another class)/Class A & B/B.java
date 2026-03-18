public class B extends A {

    void display2() {
        System.out.println("Display method 2nd in class B");
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }

}
