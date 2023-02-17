//WAP
import java.util.*;
class p20
{
	public static void main(String [] args)
	{
		String name;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name ");
		name=s.nextLine();
		System.out.println("Name in upper case = "+name.toUpperCase());
		System.out.println("Name in lower case = "+name.toLowerCase());
		System.out.println("length your name  = "+name.length());
	}
}