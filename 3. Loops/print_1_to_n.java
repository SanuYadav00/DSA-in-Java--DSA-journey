/* WAP to print numbers from 1 to n */
import java.util.*;
public class print_1_to_n {
   public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter upto which number from 1 you want to print:");
    int a=sc.nextInt();
    int counter=1;
    while (counter<=a) {
        System.out.print(" "+counter);
        counter++;
    }
    sc.close();
   } 
}
