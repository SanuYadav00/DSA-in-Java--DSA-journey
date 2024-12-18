import java.util.*;
public class priority_queue_for_objects  {
  static class Students implements Comparable<Students> {
    String name;
    int rank;

    public Students(String name,int rank) {
      this.name=name;
      this.rank=rank;
    }
    @Override 
    public int compareTo (Students s2) {
      return this.rank-s2.rank; // sorts in ascending order according to rank
    }

  }
  public static void main(String args[]) {
    // PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder()); // it gives high priority to high values, not low values
    PriorityQueue<Students> pq=new PriorityQueue<>(); // gives high priority to low values
    pq.add(new Students("sanu", 12)); // O(logn)
    pq.add(new Students("shyam", 1));
    pq.add(new Students("subash", 3));
    pq.add(new Students("rohit", 15));
    pq.add(new Students("krrish", 2));
    pq.add(new Students("prem", 9));
    while (!pq.isEmpty()) {
      System.out.println(" "+pq.peek().name+" "+pq.peek().rank); // O(1)
      pq.remove(); // O(logn)
    }
  }
}