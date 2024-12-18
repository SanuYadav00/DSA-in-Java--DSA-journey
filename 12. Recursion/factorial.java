/* write a program using recursion to print the factorial of a number */
// factorial of 1=1; factorial of 0=1
// factorial of negative numbers doesn't exist
// time complexity of this code is O(n)
import java.util.*;
public class factorial {
 public static int find(int n) {
    if (n==0) {
        return 1;
    }
    return (n* find(n-1));

    

}
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int a=find(n);
        System.out.print("The factorial of "+n+" is:"+a);
        sc.close();

    }
}