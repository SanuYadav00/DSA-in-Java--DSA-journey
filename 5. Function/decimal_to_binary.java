/* Write a program to convert decimal to binary */
import java.util.*;
public class decimal_to_binary {
    public static int conversion(int a) {
        int b=0;
        int p=0;
         while (a!=0) {
              int c=a%2;
              b=b+(c*(int)(Math.pow(10,p)));
              a/=2;
              p++;

         }
         return b;
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number in decimal system:");
        int n=sc.nextInt();
        int binary=conversion(n);
        System.out.println("The binary equivalent equivalent is:"+binary);
        sc.close();


    }
}