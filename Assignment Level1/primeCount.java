import java.util.*;
public class primeCount {
    public static void main(String arg[]){
        int i,j,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower limit: ");
        int n=sc.nextInt();
        System.out.print("Enter upper limit: ");
        int m=sc.nextInt();
        System.out.print("Prime number between "+n+" and "+m+": ");
        for(i=n;i<=m;i++) {
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0)
                    break;
            }
            if (j > i / 2)
                System.out.print(i+" ");
        }
    }
}
