// WAP to check given string is palindrome or not;
import java.util.*;
class p25
{
	public static void main(String [] args)
	{
		String str,revstr="";
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a string : ");
		str=s.nextLine();
		for(int i=str.length()-1;i>=0;i--)
		{
			revstr=revstr+str.charAt(i);
		}
		if(str.equalsIgnoreCase(revstr)==true)
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
	}
}