import java.util.Scanner;
public class reverse 
{
    public static void main(String[] args) 
    {
        int rev=0,d;
        System.out.println("Enter a number to reverse" );
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0)
        {
            d=n%10;
            rev=(rev*10)+d;
            n=n/10;
        }
        System.out.println("Reverse Number is = "+rev);
    }
}

