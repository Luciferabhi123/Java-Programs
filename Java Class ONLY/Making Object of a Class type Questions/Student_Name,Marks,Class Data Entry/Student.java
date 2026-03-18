public class Student {
    
        
        int Marks;
        String className, Student_name;


    Student(String Student_name, String className, int Marks){
       
        this.Student_name = Student_name;
        this.className = className;
        this.Marks = Marks;


    }
    public void showAll(){
        System.out.println("Student Name="+this.Student_name);
        System.out.println("Class="+this.className);
        System.out.println("Marks="+this.Marks);
    }
    public static void main(String[] args) {
     Student ob1 = new Student("Abhay Yadav","MCA",90);
     Student ob2 = new Student("Abhay Kumar","MCA",80);
     Student ob3 = new Student("Abhay Upadhayay","MCA",95);
     Student ob4 = new Student("Ashish Kumar","MCA",80);
     Student ob5 = new Student("Anuj Kumar","MCA",80);

     ob1.showAll();
     ob2.showAll();
     ob3.showAll();
     ob4.showAll();
     ob5.showAll();
    }
}
