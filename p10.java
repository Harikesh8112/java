//WAP to make a simple caculetor using switch.
import java.util.*;
class p10
{
    public static void main(String [] args)
    {
        int x,y,ch;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two number : ");
        x=s.nextInt();
        y=s.nextInt();
        System.out.println("1-> Addition");
        System.out.println("2-> Subtraction");
        System.out.println("3-> Multiplication");
        System.out.println("4-> Division");
        ch=s.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Summation = "+(x+y));
            break;
            case 2:
            System.out.println("Subbraction = "+(x-y));
            break;
            case 3:
            System.out.println("Multiplication = "+(x*y));
            break;
            case 4:
            System.out.println("Divission = "+(x/y));
            break;
            default:
            System.out.println("Invalid choice ");
            break;

        }

    }
}