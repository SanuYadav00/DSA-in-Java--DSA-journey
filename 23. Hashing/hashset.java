/* Write  aprogram to show the operations of a hashset */
import java.util.*;
public class hashset {
  public static void main(String args[]) {
  //  HashSet<Integer> set=new HashSet<>();
  //  set.add(1);
  //  set.add(2);
  //  set.add(4);
  //  set.add(3);
  //  set.add(2);
  //  set.add(1);
  //  System.out.println(set);
  //  System.out.println(set.contains(2));
  //  System.out.println(set.contains(5 ));
  //  set.remove(2);
  //  System.out.println(set.contains(2));
  //  System.out.println(set.size());
  //  set.clear();
  //  System.out.println(set);
  //  System.out.println(set.size());
  HashSet<String> set=new HashSet<>();
   set.add("Nepal");
   set.add("India");
   set.add("USA");
   set.add("Spain");
   set.add("Nepal");
   set.add("Italy");
   Iterator it=set.iterator();
   while (it.hasNext()) {
    System.out.println(it.next());
   }
  // for (String s:set) {
  //   System.out.println(s);
  // }

  }
  
}
