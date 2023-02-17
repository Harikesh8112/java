//WAP to find Gretest number in three unequal numbers.
import java.util.*;
class p8
{
    public static void main(String [] args)
    {
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System. out. println("Enter all three numbers:");
        a = s. nextInt();
        b = s. nextInt();
        c = s. nextInt();
       if(a>b && a>c)
       {
        System.out.print("gretest number"+a);
       }
       else if (b>c && b>a)
       {
        System.out.print("gretest number"+b);
       }
       else if(c>a && c>b) 
       {
        System.out.print("gretest number"+c);
       }
       else 
       {
        System.out.print("defalt value ");
       }
    }

    }
