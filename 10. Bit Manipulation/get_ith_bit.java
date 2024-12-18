/* Write a program to find the ith bit of a number */
import java.util.*;
public class get_ith_bit {
    public static void check(int n,int i) {
        if ((n&(1<<i))==0) {
          System.out.println("The "+i+" bit of the number is 0.");
        } 
        else {
            System.out.println("The "+i+" bit of the number is 1.");
        }
        return;
    }
public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter a number:");
    int n=sc.nextInt();
    System.out.print("Enter the no of bit you want to find:");
    int i=sc.nextInt();

    check(n,i);
    sc.close();



}
}