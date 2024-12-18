/* Write a program to implement deque using JCF */
import java.util.*;
public class deque {
  public static void main(String args[]) {
    Deque<Integer> d=new LinkedList<>();
    d.addFirst(1);
    d.addFirst(2);
    d.addFirst(3);
    System.out.println(d);
    d.addLast(4);
    d.addLast(5);
    d.addLast(6);
    System.out.println(d);
    d.removeFirst();
    System.out.println(d);
    d.removeLast();
    System.out.println(d);
    System.out.println(d.getFirst());
    System.out.println(d.getLast());
  }
}
