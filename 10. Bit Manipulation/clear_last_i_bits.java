/* Write a program to clear the last i bits of a number= */
import java.util.*;
public class clear_last_i_bits {
    public static int clear(int n,int i) {

        int a=n&((~(0))<<i);
        return a;
    }
public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter a number:");
    int n=sc.nextInt();
    System.out.print("Enter the no of bit from last you want to clear:");
    int i=sc.nextInt();
    n=clear(n,i);
    System.out.println("The number after clearing last "+i+" bit is:"+n);
    sc.close();
}
}