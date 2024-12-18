/* Print all binary strings of size n without consecutive ones
Binary strings= Any combination of 0 and 1 */ 
import java.util.*;
public class binary_strings_problem {
 public static void print (int n,int lastplace,String sb) {
    if (n==0) {
        System.out.println(sb);
        return;
        }
    if (lastplace==0) {
        print(n-1,0,sb+"0");
        print(n-1,1,sb+"1");
    }
    else {
        print(n-1,0,sb+"0");

    }
    
    }

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of string:");
        int n=sc.nextInt();
        System.out.print("The binary strings without consecutive ones are:");
        print(n,0,"");
        
        sc.close();

    }
}