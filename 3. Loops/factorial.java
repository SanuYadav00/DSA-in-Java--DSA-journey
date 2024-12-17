/* WAP to print the factorial of a number*/
import java.util.*;
public class factorial {
   public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter the number:");
    int n=sc.nextInt();
    int factorial=1;
    int a=1;
    while (a<=n) {
        factorial*=a;
        a++;
    }
    System.out.println("The factorial is:"+factorial);
    sc.close();
   } 
}
