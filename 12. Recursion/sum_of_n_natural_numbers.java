/* write a program using recursion to print the sum of natural numbers upto n */
// natural numbers start from 1 and end at infinity
// time complexity of this code is O(n)
import java.util.*;
public class sum_of_n_natural_numbers {
 public static int find(int n) {
    if (n==1) {
        return 1;
    }
    return (n+ find(n-1));

    

}
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int a=find(n);
        System.out.print("The sum of natural numbers upto "+n+" is:"+a);
        sc.close();

    }
}