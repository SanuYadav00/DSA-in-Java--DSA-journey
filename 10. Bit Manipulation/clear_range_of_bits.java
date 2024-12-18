/* Write a program to clear the given range of bits of a number= */
import java.util.*;
public class clear_range_of_bits {
  public static int clear(int n,int a,int b) {
        int n1= (~(0))<<(b+1);
        // int n2=(int)(Math.pow(2,a))-1;
        int n2=(1<<a)-1;
        int s=n&(n1|n2);
        
        return s;
    }
public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter a number:");
    int n=sc.nextInt();
    System.out.print("Enter the starting point of range of bits you want to clear:");
    int a=sc.nextInt();
    System.out.print("Enter the ending point of range of bits you want to clear:");
    int b=sc.nextInt();
    n=clear(n,a,b);
    System.out.println("The number after clearing range of bits from "+a+" to "+b+"th bit is:"+n);
    sc.close();
}
}