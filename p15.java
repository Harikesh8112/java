// WAP to print table of given number,
import java.util.Scanner;
class p15
{
	public static void main(String [] args)
	{
		int n,i,t;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number : ");
		n=s.nextInt();
		for(i=1;i<=10;i++)
		{
		t=n*i;		
		//System.out.println(n+"*"+i+"="+t);
		System.out.printf("%d*%d=%d\n",n,i,t);
		}
		
	}
}