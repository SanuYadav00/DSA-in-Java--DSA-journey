/* Write a program to swap two numbers without using any 3rd variable
 */
import java.util.*;
public class swap_numbers {
public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter a number:");
    int a=sc.nextInt();
    System.out.print("Enter another:");
    int b=sc.nextInt();
    a=a^b;
    b=a^b;
    a=a^b;
    System.out.println("a="+a+"  b="+b);
sc.close();
}
}