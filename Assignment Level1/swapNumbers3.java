import java.util.*;
public class swapNumbers3 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b=sc.nextInt();
        System.out.println("Enter the 3rd number");
        int c=sc.nextInt();
        int temp;
        System.out.println("Initial values");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        a = a + b + c;
        b = a - (b + c);
        c = a - (b + c);
        a = a - (b + c);
        System.out.println("New values");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }
}

