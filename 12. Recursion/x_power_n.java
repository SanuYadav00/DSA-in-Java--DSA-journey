/* write a program using recursion to print x power n of a number where x is base and n is power */
// time complexity of this code is O(n)
import java.util.*;
public class x_power_n {
 public static int find(int x,int n) {
    if (n==0) {
        return 1;
    }
    return (x* find(x,n-1));

    

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