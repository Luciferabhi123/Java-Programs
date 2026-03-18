/*WAP program to count Total number of Students who's Name Starts with 'A'
from a given Array of String that stored Names of 7 Students?*/

public class Students{
	public static void main(String args[]){
		
		String names[]={"Ajay","Vijay","Anand","Ram","Zubair"};
		int Count=0;
		for(String n:names){
			if(n.charAt(0)=='A')
				Count++;
		}
		System.out.println("total students who's name starts with 'A' "+ 
		Count)
	}
}	