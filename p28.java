// 
import java.util.*;
class p28
{
	int volume(int l,int b,int h){
		return (l*b*h);
	}
	public static void main(String [] aegs)
	{
		int a,b,c,res;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter length of cuboid : ");
		a=s.nextInt();
		System.out.print("Enter breadth of cuboid : ");
		b=s.nextInt();
		System.out.print("Enter height of cuboid : ");
		c=s.nextInt();
		p28 p=new p28(); //object cteate volume
		res=p.volume(a,b,c);
		System.out.println("Volume of cuboid = "+res);
		
		
	}
}