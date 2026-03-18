/*WAP to input two Strings and check that both Strings are of equal 
length or not?*/

import java.util.Scanner;
public class Check_String_Equal{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String n1,n2;
		System.out.println("Enter First String=");
		n1=sc.nextLine();
		System.out.println("Enter Second String=");
		n2=sc.nextLine();
		if(n1.length()==n2.length())
			System.out.println("Both Strings are Equal");
		else
			system.out.println("Both Strings are not Equal");
	}
}