/* Write a program to convert binary to decimal */
import java.util.*;
public class binary_to_decimal {
    public static int decimal(int a) {
        int d=0;
        int p=0;
         while (a!=0) {
              int b=a%10;
              d=d+ (int)(Math.pow(2,p)*b);
              p++;
              a/=10;

         }
         return d;
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number in binary system:");
        int n=sc.nextInt();
        int deci=decimal(n);
        System.out.println("The decimal equivalent is:"+deci);
        sc.close();


    }
}