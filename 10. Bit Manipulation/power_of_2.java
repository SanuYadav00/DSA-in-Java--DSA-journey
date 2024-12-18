/* Write a program to find if the given number is power of 2 or not */
import java.util.*;
public class power_of_2 {
    public static void check(int n) {
        if ((n&(n-1))==0) {
          System.out.println("It is a power of 2.");
        } 
        else {
            System.out.println("It is not a power of 2.");
        }
        return;
    }
public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    for (int i=0;i<5;i++) {
    System.out.print("Enter a number:");
    int n=sc.nextInt();
    check(n);
    }
    sc.close();



}
}