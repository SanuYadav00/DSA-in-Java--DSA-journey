/* Write a program to show the differences betweeen all three sets */
import java.util.*;
public class comparison_between_sets {
  public static void main(String args[]) {
    HashSet<String> set=new HashSet<>();
   set.add("Nepal");
   set.add("India");
   set.add("USA");
   set.add("Spain");
   set.add("Nepal");
   set.add("Italy");
   Iterator it=set.iterator();
   System.out.println(" for HashSet");
   while (it.hasNext()) {
    System.out.print(it.next()+" ");
   }
   System.out.println();

   LinkedHashSet<String> se=new LinkedHashSet<>();
   se.add("Nepal");
   se.add("India");
   se.add("USA");
   se.add("Spain");
   se.add("Nepal");
   se.add("Italy");
   Iterator i=se.iterator();
   System.out.println(" for Linked HashSet");
   while (i.hasNext()) {
    System.out.print(i.next()+" ");
   }
   System.out.println();

   TreeSet<String> s=new TreeSet<>();
   s.add("Nepal");
   s.add("India");
   s.add("USA");
   s.add("Spain");
   s.add("Nepal");
   s.add("Italy");
   Iterator j=s.iterator();
   System.out.println(" for Tree Set");
   while (j.hasNext()) {
    System.out.print(j.next()+" ");
   }
   System.out.println();
  
  
   
  }
  
}
