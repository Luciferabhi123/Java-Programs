//WAP to display mathematical table of 4 and 6 simultaneously 
//using multithreading in java 

class Mat extends Thread 
{
int n;
public Mat (int n)
{
this.n= n;
}
public void run()
{
	try{
for(int i=1;i<=10;i++)
System.out.println(this.n+"X"+i+"="+(this.n*i));
}
 catch(Exception e){
 System.out.println("Exception Arise");
}
}
public static void main(String args[])
{
	Mat ob1=new Mat(4);
	Mat ob2=new Mat(6);
	ob1.start();
	ob2.start();
}
}	