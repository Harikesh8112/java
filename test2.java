// WAP to find greatest number in two unequl numbers.
import java.util.*;
class test2
{
    public static void main (String [] args){
        int a,l,w,p;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two numbrt  : ");
        l=s.nextInt();
        w=s.nextInt();
        p=2*(l+w);
        a=l*w;
        System.out.println("Area = "+a);
        System.out.println("Paramiter = "+p);
    }
}