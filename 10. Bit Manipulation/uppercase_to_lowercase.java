/* Write a program to convert uppercase characters to lowercase using bits
 */
import java.util.*;
public class uppercase_to_lowercase {
public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    for (int i=0;i<10;i++) {
    System.out.print("Enter a uppercase character:");
    char a=sc.next().charAt(0);
    System.out.println("The character in lowercase is:"+(char)(a|' '));
}

sc.close();
}
}