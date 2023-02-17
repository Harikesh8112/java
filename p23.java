//Word Counter
import java.util.*;
class p23
{
	public static void main(String[]args)
	{
		String sen;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a sentence : ");
		sen=s.nextLine();
		String [] words=sen.split(" ");
		int l=words.length;
		System.out.println("No of words = "+l);
	}
}