// WAP 
import java.util.*;
class p24
{
	public static void main (String [] args)
	{
		String sen,fw,rw;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a sentence : ");
		sen=s.nextLine();
		System.out.print("Find what? ");
		fw=s.nextLine();
		System.out.print("Replace what : ");
		rw=s.nextLine();
		System.out.println("Modified Sentence="+sen.replace(fw,rw));
	}
}