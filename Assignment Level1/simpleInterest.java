import java.util.*;
public class simpleInterest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principle amount");
        float pa=sc.nextFloat();
        System.out.println("Enter the time in years");
        float t=sc.nextFloat();
        System.out.println("Enter the rate of interest");
        float i=sc.nextFloat();
        double interest;
        interest=(pa*t*i)/100;
        System.out.println("Interest is "+interest);
    }
}
