import java.util.*;
public class reverseString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.next();
        String rstr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);     
            rstr = ch + rstr;
        }
        System.out.println(rstr);
    }
}
