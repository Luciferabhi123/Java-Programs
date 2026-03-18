class M1 extends Thread 
{
int n;
public M1 (int n)
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