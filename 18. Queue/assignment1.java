/* Generate Binary Numbers
Given a number N. The task is to generate and print all
binary numbers with decimal values from 1 to N.
Sample Input 1: N =2
Sample Output 1: 1 10
Sample Input 2: 5.
Sample Output 2: 1 10 11 100 10 */
// Time Complexity O(n)
// Space Complexity O(n)
import java.util.*;
public class assignment1 {
  public static void generatebinary(int n) {
    Queue<String> q=new LinkedList<>();
    q.add("1");
    while (n-->0) {
      String s1=q.peek();
      q.remove();
      System.out.print(" "+s1);
      q.add(s1+"0");
      q.add(s1+"1");
    }
    return;
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number upto which binary values you want to print:");
    int n=sc.nextInt();
    generatebinary(n);
    sc.close();
  }
}
