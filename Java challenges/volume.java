import java.util.*;

public class volume {
	public static void main(String args[])
	{
 	int r, h;
    	Scanner in = new Scanner(System.in);
    	System.out.print("Enter your radius: ");
    	r = in.nextInt();
    	System.out.print("Enter your height: ");
    	h = in.nextInt();
    	double V= (3.14)*(r*r*h);
    	System.out.print("Volume is "+V);
	}
}

