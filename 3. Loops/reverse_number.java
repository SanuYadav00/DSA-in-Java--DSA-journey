/* WAP to print a reverse of a number
*/
import java.util.*;
public class reverse_number {
   /* public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter a number which you want to reverse:");
    int n=sc.nextInt();
    System.out.print("The reverse is:");
    while(n>0) {
        int rev=n%10;
        System.out.print(rev);
        n/=10;
    }
    
   
   sc.close();
}
}
*/
public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter a number which you want to reverse:");
    int n=sc.nextInt();
    int reverse=0;
    while(n>0) {
        int rev=n%10;
        reverse=(reverse*10)+rev;
        n/=10;
    }
    System.out.print("The reverse is:"+reverse);
   
   sc.close();
}
}


