/* Write a program to check the properties of library function */
import java.util.*;
public class library_function {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        System.out.print("Enter another number:");
        int m=sc.nextInt();
        int a=Math.min(m,n);
        int b=Math.max(m,n);
        int c=(int)(Math.sqrt(n));
        int d=(int)(Math.pow(c,2));
        int e=Math.abs(n);
        int f=Math.abs(-5);
    



        System.out.println("The answers are:"+a+b+c+d+e+f);
        sc.close();


    }
}
