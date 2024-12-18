/* write a program using recursion to print numbers from n to 1 */
import java.util.*;
public class print_n_to_1 {
 public static void print(int n) {
    if (n==0) {
        return;
    }
    System.out.print(" "+n);
    print(n-1);
    

}
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        System.out.print("The numbers are:");
        print(n);
        sc.close();

    }
}