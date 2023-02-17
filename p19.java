// WAP to take five names as input and displye names in alphabetical oeder.
import java.util.*;
class p19
{
	public static void main(String [] args)
	{
		String [] name=new String[5];
		int i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name ");
		for(i=0;i<name.length;i++)
		{
			name[i]=s.nextLine();
			
		}
		Arrays.sort(name);System.out.println("Names in alphabetical order ");
		for(String n:name)
		{
			System.out.println(n);
		}
	}
}