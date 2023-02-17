// WAP to chech given number is prime or not.
import java.util.*;
class p17
{
	public static void main(String [] args)
	{
		int n, i, c=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number : ");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.print("Number is Prime ");
		}
		else
		{
			System.out.print("Number is not Prime ");
		}
	}
}