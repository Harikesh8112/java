
/*
Write a program to find volume and surface area of cuboid; v=l*b*h;sa=2*(l*b+b*h+h*l);
*/
import java.util.*;

class p4 {
    public static void main(String[] args) {
        int l, b, h, v, sa;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length : ");
        l = s.nextInt();
        System.out.print("Enter Height : ");
        h = s.nextInt();
        System.out.print("Enter breadth : ");
        b = s.nextInt();
        v = l * h * b;
        sa = 2 * (l * b + b * h + h * l);
        System.out.println("Volume = " + v);
        System.out.println("Surface Area = " + sa);
    }

}