class M2 extends Thread 
{
int n;
class M2 extends Thread 
{
int n;
public M2 (int n)
{
this.n= n;
}
public void run()
{
	try{
for(int i=1;i<=100;i++)
System.out.println("Odd value="+i);
}
 catch(Exception e){
 System.out.println("Exception Arise");
}
}