import java.util.*;
public class stringEmpty{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        if (str == null || str.isEmpty())
            System.out.println("string is empty");
        else
            System.out.println("string is not empty");

    }}


