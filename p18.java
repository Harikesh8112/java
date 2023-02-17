//WAP to take 10numbers as input. Store these numbers in array and find sum and average.
import java.util.*;
class p18
{
	public static void main(String [] args)
	{
		int [] list=new int [10];
		int i,sum=0;
		double avg;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ten numbers to list ");
		for(i=0;i<10;i++){
			list[i]=s.nextInt();
			sum=sum+list[i];
		}
		avg=(float)sum/10;
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+avg);
		
		
	}
}