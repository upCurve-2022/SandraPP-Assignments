import java.util.*;
public class immutableOrNot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s = sc.nextLine();
        System.out.println(s.hashCode());
        System.out.println("Enter string to concat : ");
        String str = sc.nextLine();
        s = s+str;
        System.out.println("After concatenation: "+s);
        System.out.println(s.hashCode());
        System.out.println("Immutable since hashcode changed");

    }
}

