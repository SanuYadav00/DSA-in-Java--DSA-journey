/* write a program using recursion to print the nth fibonacci number */
// fibonacci numbers are 0 1 1 2 3 5 8 13 21 34 55 89
// space complexity O(n)
// time complexity O(2^n) exponential time complexity
import java.util.*;
public class nth_fibonacci_number {
 public static int find(int n) {
    if (n==0 || n==1) {
        return n;
    }
    // return find(n-2)+find(n-1);
    int f1=find(n-2);
    int f2=find(n-1);
    int fn=f1+f2;

    return fn;

    

}
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number whose nth value you want to find in fibonacci series:");
        int n=sc.nextInt();
        int a=find(n);
        System.out.print("The "+n+"th number in the sequence is:"+a);
        sc.close();

    }
}