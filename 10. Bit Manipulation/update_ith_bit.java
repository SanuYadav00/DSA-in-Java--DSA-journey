/* Write a program to update the ith bit with a given number */
import java.util.*;
public class update_ith_bit {
    public static int clear(int n,int i) {

        int a=n&(~(1<<i));
        return a;
    }
    public static int set(int n,int i) {
        int a=n|(1<<i);
        return a;
    }
public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter a number:");
    int n=sc.nextInt();
    System.out.print("Enter the no of bit you want to update:");
    int i=sc.nextInt();
    System.out.print("Enter the value you want to update with:");
    int v=sc.nextInt();
    int a;
    if (v==0) {
        a=clear(n,i);
    }
    else {
        a=set(n,i);
    }
    System.out.println("The number after clearing "+i+"th bit is:"+a);
    sc.close();
}
}