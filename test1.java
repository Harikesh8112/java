// WAP to find greatest number in two unequl numbers.
import java.util.*;
class test1
{
    public static void main (String [] args){
        int d;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the day  : ");
        d=s.nextInt();
        if(d%4==0)
        {
        System.out.println(d+" is the leap year");
        }
        else
        {
        System.out.println(d+" is the not leap year");
        }
    }
}