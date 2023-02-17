//WAP to find Gretest number in three unequal numbers user tranry operator.
import java.util.*;
class p9
{
    public static void main(String [] args)
    {
        int a,b,c,g;
        Scanner s=new Scanner(System.in);
        System. out. println("Enter all three numbers:");
        a = s. nextInt();
        b = s. nextInt();
        c = s. nextInt();

        g=(a>b)?((a>c)?a:c):((b>c)?b:c); // ()?():();
        System.out.print("Gretest Number = "+g);
    }
    
}
