/* write a program to find length of a string using recursion*/
import java.util.*;
public class length_of_string {
 public static int length (String s) {
    if (s.length()==0) {
        
        return 0;
    }
    return length(s.substring(1))+1;
    
    }

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string:");
        String s=sc.nextLine();
        System.out.println("The length of string is:"+length(s));
        sc.close();

    }
}