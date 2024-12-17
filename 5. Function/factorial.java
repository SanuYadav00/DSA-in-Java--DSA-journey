/* Write a program using function to print the factorial of a number */
import java.util.*;
public class factorial {
    public static int facto(int a) {
        int factorial=1;
         for (int i=1;i<=a;i++) {
              factorial*=i;
         }
         return factorial;
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int fact=facto(n);
        System.out.println("The factorial is:"+fact);
        sc.close();


    }
}