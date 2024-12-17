/* Write a program to check a number is palindrome or not */
import java.util.*;
public class sum_of_digits {
    public static int sum (int a) {
        int d=0;
         while (a!=0) {
              int b=a%10;
              d=d+b;
              a/=10;

         }
            return d;
         }
         
    
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int a=sum(n);
            System.out.println("The sum of digits is:"+a);
    
        sc.close();

    }



}