/* You are given a number(eg-2019), Covert it into a string of english
like "two zero one nine".Use a recursive function.The last digit can't be zero
 */
import java.util.*;
public class number_to_string {
    static String word[]={ "zero","one","two","three","four","five","six","seven","eight","nine"};
 public static void print(int n) {
    if(n==0) {
        return;
    }
    int lastdigits=n%10;
    print(n/10);
    System.out.print(word[lastdigits]+" ");
    
}
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        System.out.print("The number in words is:");
        print(n);
        sc.close();

    }
}