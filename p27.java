// WAP to sum of two numbers using user defind method.
import java.util.*;
class p27
{
	static int add(int x,int y){
		return (x+y);
	}
	public static void main(String[]args)
	{
		int n1,n2,res;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two number : ");
		n1=s.nextInt();
		n2=s.nextInt();
		res=add(n1,n2);
		System.out.println("result = "+res);
		
	}
}