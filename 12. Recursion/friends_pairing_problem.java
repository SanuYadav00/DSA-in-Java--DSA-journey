/* Given n friends, each one can remain single or can be paired up with some other friend.
  Each friend can be paired only once. Find out the total number of ways
  in which friends can remain single or can be paired up.
 */
import java.util.*;
public class friends_pairing_problem {
 public static int find (int n) {
    if (n==1 || n==2) {
        return n;
    }
    // if someone decides to be single , find (n-1);
    // if someone decides to make pair, (n-1)*find(n-1);
    return find(n-1)+((n-1) *find(n-2));
    
    }

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the total no. of friends:");
        int n=sc.nextInt();
        int b= find(n);
        System.out.println("The total number of ways in which the friends can be paired is:"+b);
        sc.close();

    }
}