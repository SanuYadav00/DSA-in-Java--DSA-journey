/* Write a program to check a number is palindrome or not */
import java.util.*;
public class palindrome {
    public static boolean check (int a) {
        boolean c=true;
        int d=0;
        int num=a;
         while (a!=0) {
              int b=a%10;
              d=d*10+b;;
              a/=10;

         }
         if (num==d) {
            return c;
         }
         else {
            c=false;
            return c;
         }
         
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        boolean a=check(n);
        if (a==true) {
            System.out.println("It is a palindrome number.");
        } 
        else {
            System.out.println("It is not a palindrome number.");
        } 
        
        sc.close();

    }
    }
