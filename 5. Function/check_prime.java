/* Write a optimized program using function to 
check if a number is prime or not */
import java.util.*;
public class check_prime {
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
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        boolean check=facto(n);
        if (check==true) {
            System.out.println("The number is a prime number:");

        } else {
            System.out.println("The number is a composite number:");
        }

        sc.close();


    }
}
