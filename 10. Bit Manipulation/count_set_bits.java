/* Write a program to count the number of set bits(no. of 1's) in a given number */
import java.util.*;
public class count_set_bits {
    public static int count(int n) {
        int a=0;
        while (n!=0) {
            if ((n&1)==1) {
                a++;
            }
            n=(n>>1);
        }
        return a;
    }
public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter a number:");
    int n=sc.nextInt();
    int a=count(n);
    System.out.println("The total set bits in "+n+" is:"+a);
    sc.close();



}
}