import java.util.*;

public class ascii {
	public static void main(String args[])
	{
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter your character: ");
    	char c = sc.next().charAt(0);
    	int a = c;
    	System.out.println("The ASCII value of " + c + " is: " + a);
	}
}

