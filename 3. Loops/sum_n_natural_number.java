/* WAP to print sum of n natural numbers*/
import java.util.*;
public class sum_n_natural_number {
   public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter number upto whose sum you want to print:");
    int a=sc.nextInt();
    int counter=1;
    int sum=0;
    while (counter<=a) {
        sum+=counter;
        counter++;
    }
    System.out.println("The sum is:"+sum);
    sc.close();
   } 
}

    

