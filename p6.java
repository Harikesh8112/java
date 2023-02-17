// WAP to chech given number is even or odd;
import java.util.*;
class p6
{
    public static void main (String ... aegs){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number : ");
        n=s.nextInt();
        if(n%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}