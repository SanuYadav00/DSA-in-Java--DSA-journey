/* Write a program to print binomial coefficient of a number */
import java.util.*;
public class binomial_coefficient {
    public static int bino_coeff(int n,int r) {
        return (factorial(n)/(factorial(r)*factorial(n-r)));
    
    }
    public static int factorial(int a) {
        int f=1;
         for (int i=1;i<=a;i++) {
              f*=i;
         }
         return f;
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter total number of items(n):");
        int n=sc.nextInt();
        System.out.print("Enter total number of items selected(r):");
        int r=sc.nextInt();
        System.out.println("The binomial coeffiecient is:"+bino_coeff(n,r));
        sc.close();


    }
}
