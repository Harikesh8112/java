// WAP to converd a decimal number to its binary,octal,hexa-decimal;
import java.util.*;
class p26
{
	public static void main(String[]args)
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number : ");
		n=s.nextInt();
		System.out.println("Binry format ="+Integer.toString(n,2));
		System.out.println("Octal format ="+Integer.toString(n,8));
		System.out.println("hexa-decimal format ="+Integer.toString(n,16));
	}
}