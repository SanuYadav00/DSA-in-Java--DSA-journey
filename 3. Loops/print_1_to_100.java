/* WAP to print numbers from 1 to 100 */
import java.util.*;
public class print_1_to_100 {
   public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    int counter=1;
    while (counter<=100) {
        System.out.print(" "+counter);
        counter++;
    }
    sc.close();
   } 
}
