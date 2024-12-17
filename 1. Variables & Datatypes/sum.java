/*
// without using input
 public class sum {
    public static void main(String args[]) {
        int a=10;
        int b=5;
        int sum=a+b;;
        System.out.println("The sum is "+sum);

    }
    
}
*/
import java.util.*;
public class sum {
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        System.out.print("Enter second number:");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("The sum is: "+sum);
        sc.close();

    }
    
    
}
