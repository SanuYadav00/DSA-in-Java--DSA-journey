/* Write a program to add 1 to an integer using bit manipulation
 */
import java.util.*;
public class add_1 {
public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter a number:");
    int a=sc.nextInt();
    int b=-(~a);
    System.out.println("The value of the number after adding 1 is:"+b);

    
    

sc.close();
}
}