/* Write a program to make the ith bit of a number 1 */
import java.util.*;
public class set_ith_bit {
    public static int check(int n,int i) {

        int a=n|(1<<i);
        return a;
    }
public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter a number:");
    int n=sc.nextInt();
    System.out.print("Enter the no of bit you want to make 1:");
    int i=sc.nextInt();

    int a=check(n,i);
    System.out.println("The number after setting "+i+"th bit is:"+a);
    sc.close();



}
}