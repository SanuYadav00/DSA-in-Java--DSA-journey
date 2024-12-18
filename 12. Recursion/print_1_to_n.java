/* write a program using recursion to print numbers from 1 to n */
import java.util.*;
public class print_1_to_n {
 public static void print(int n) {
    if (n==1) {
        System.out.print(n+" ");
        return;
    }
    print(n-1);
    System.out.print(n+" ");

    

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