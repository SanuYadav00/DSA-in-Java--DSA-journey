/* We are given a string S, we need to find the count of all contiguous
substrings starting and ending with the same character using recursion
for eg, abcab has 15 substrings and out of them 7 substrings which 
are a,abca,b,bcab,c,a and b start and end with same letter
*/
import java.util.*;
public class substring {
 public static int count (String s,int i,int j,int n) {
    if (n==1) {
        
        return 1;
    }
    if (n<=0) {
         return 0;
    }
    int result=count(s,i+1,j,n-1)+count(s,i,j-1,n-1)-count(s,i+1,j-1,n-2);
    if (s.charAt(i)==s.charAt(j)) {
       result++;
    }
    return result;
    }

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string:");
        String s=sc.nextLine();
        int n=s.length();
        int b=count(s,0,n-1,n);
        System.out.println("The count of digits which start and end with same characters is:"+b);
        sc.close();

    }
}