class Teacher
{
    static 
    {
        System.out.println("Within show");
    }
    
    static int x;

    public void show(){
        System.out.println("Within show"+x);
    }

    public static void main(String[] args)
    {
        System.out.println("Within main");
        x=100;
    }
}