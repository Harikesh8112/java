//WAP to make simple calculator.
import java.util.Scanner;
class p3
{
    public static void main(String[] args)
    {
    int a,b;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter two Number = ");
    a=s.nextInt();
    // System.out.print("Enter second Number = ");
    b=s.nextInt();
    // c=a+b;
    System.out.println("Summation = "+(a+b));
    System.out.println("Subtraction = "+(a-b));
    System.out.println("Multiplication = "+(a*b));
    System.out.println("Division = "+(a/b));
    }
}