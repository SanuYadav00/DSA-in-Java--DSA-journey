import java.util.LinkedList;
public class ll_using_jcf {
  public static void main(String args[]) {
LinkedList<Integer> ll=new LinkedList<>();
ll.addLast(10);
ll.addFirst(5);
ll.addLast(1);
ll.addFirst(15);
ll.addLast(20);
ll.addFirst(17);
System.out.println(ll);
ll.removeFirst();
ll.removeLast();
System.out.println(ll);
ll.removeFirst();
ll.removeLast();
ll.addLast(10);
ll.addFirst(5);
System.out.println(ll);
System.out.println(ll.get(3));
  }

  
}
