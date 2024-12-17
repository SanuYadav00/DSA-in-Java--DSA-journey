/* Write a program to print all the prime numbers in a given range */
import java.util.*;
public class prime_numbers_in_a_range {
    public static boolean facto(int a) {
        boolean fact=true; 
        if (a==2) {
            return true;
        }
         for (int i=2;i<=Math.sqrt(a);i++) {
              if (a%i==0) {
                fact=false;
                break;
              } 
         }
         return fact;
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the end point of the range (from 2 to what):");
        int n=sc.nextInt(); 
        System.out.print("All the prime numbers in the given range are:");
        for (int i=2;i<=n;i++) {
        boolean check=facto(i);
        if (check==true) {
            System.out.print(i+" ");

        }

        sc.close();
    }


    }
}

