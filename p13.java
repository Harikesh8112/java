// WAP to find factorial og given number .
import java.util.*;
class p13
{
    public static void main(String [] args)
    {
        int n,f=1;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number to find factorial : ");
        n=s.nextInt();
        while(n>0)
        {
            f=f*n;
            n--;
        }
        System.out.println("Fectorial = "+f);
    }
}