import java.util.*;
public class priority_queue {
  public static void main(String args[]) {
    PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder()); // it gives high priority to high values
    pq.add(16); // O(logn)
    pq.add(12);
    pq.add(20);
    pq.add(10);
    pq.add(25);
    pq.add(11);
    while (!pq.isEmpty()) {
      System.out.print(" "+pq.peek()); // O(1)
      System.out.print(" "+pq.remove()); // O(logn)
    }
  }
}