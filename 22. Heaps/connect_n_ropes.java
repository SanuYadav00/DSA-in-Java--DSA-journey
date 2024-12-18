/* Given are N ropes of different lengths, the task is to connect these ropes into one rope with
 minimum cost, such that the cost to connect two ropes is equal to the sum of their lengths.
  */
import java.util.*;
public class connect_n_ropes {
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the no. of ropes (N):");
    int n=sc.nextInt();
    PriorityQueue<Integer> ropes=new PriorityQueue<>();
    System.out.print("Enter the length of all ropes:");
    for (int i=0;i<n;i++) {
       int x=sc.nextInt();
       ropes.add(x);
    }
    int cost=0;
    while (ropes.size()>1) {
      int x=ropes.remove();
      int y=ropes.remove();
      cost=cost+(x+y);
      ropes.add(x+y);
    }
    System.out.println("The minimum cost is:"+cost);
    sc.close();
  }
}
