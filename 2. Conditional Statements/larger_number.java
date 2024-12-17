import java.util.*;
public class larger_number {
   public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter first number:");
    int a=sc.nextInt();
    System.out.print("Enter second number:");
    int b=sc.nextInt();
    if (a>b) {
        System.out.println(a+" is greater than "+b +".");
    }
    else {
        System.out.println(b+" is greater than " + a+ ".");

    }


    sc.close();
   } 
}
