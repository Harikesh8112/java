
import java.util.*;
class p21
{
	public static void main(String [] args)
	{
		String str1,str2;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first name ");
		str1=s.nextLine();
		System.out.println("Enter second name");
		str2=s.nextLine();
		if(str1.equals(str2)==true)
		{
			System.out.println("Both String are equals");
		}
		else
		{
			System.out.println("Both String is not equals");
		}
	}
}