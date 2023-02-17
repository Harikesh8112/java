// WAP to print fibonacci series up to n terme.
import java.util.*;
class p16
{
	public static void main(String [] args)
	{
		int n1=0,n2=1,n3,n,i;
		Scanner s=new Scanner(System.in);
		System.out.print("How many you want in series? ");
		n=s.nextInt();
		System.out.print(n1+" "+n2+" ");
		for(i=1;i<=n-2;i++)
		{
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
		
	}
}