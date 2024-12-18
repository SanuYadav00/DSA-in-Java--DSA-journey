/* Write a program to find if the given binary number is odd or even */
import java.util.*;
public class odd_even {
    public static void check(int n) {
        if ((n&1)==0) {
          System.out.println("It is a even number.");
        } 
        else {
            System.out.println("It is a odd number.");
        }
        return;
    }
public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter a number:");
    int n=sc.nextInt();
    check(n);
    sc.close();



}
}