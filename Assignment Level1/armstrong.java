import java.util.*;
public class armstrong {
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number:");
    int n=sc.nextInt();
    int sum=0,ns=n;
    while(ns>0){
        int d=ns%10;
        sum+=d*d*d;
        ns/=10;
    }
    if(n==sum)
        System.out.println("Armstrong Number");
    else
        System.out.println("Not Armstrong Number");
 }
}
