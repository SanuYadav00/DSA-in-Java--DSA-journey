/* write a optimized program with time complexity less than O(n) using recursion
 to print x power n of a number where x is base and n is power */
// time complexity of this code is O(logn)
import java.util.*;
public class x_power_n_optimized {
 public static int find(int x,int n) {
    if (n==0) {
        return 1;
    }
    int halfsquare=find(x,n/2);
    int fullsquare=halfsquare*halfsquare;
    // if n is odd
    if (n%2!=0) {
        fullsquare*=x;
    }
    return fullsquare;
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int x=sc.nextInt();
        System.out.print("Enter the value of power of number:");
        int n=sc.nextInt();
        int a=find(x,n);
        System.out.print("The result is:"+a);
        sc.close();

    }
}
