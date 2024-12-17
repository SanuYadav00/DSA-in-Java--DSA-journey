/* WAP to check number is prime or not*/
import java.util.*;
public class check_prime {
   public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter a number:");
    int n=sc.nextInt();
    if (n<=1) {
        System.out.println("Please enter a bigger number.");
    }
    else if (n==2) {
        System.out.println(n+" is a prime number.");
    }
    else {
        boolean prime=true;
        for (int i=2;i<n;i++) {
            if (n%i==0) {
                prime=false;
                break; 
            } 
        }
        if (prime==false) {
            System.out.println(n+" is a composite number.");
        }
        else {
            System.out.println(n+" is a prime number.");
        }
    }
    sc.close();
   } 
}
