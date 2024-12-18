/* Write a program to do sorting of an arraylist */
// Time Complexity=O(n)
import java.util.Collections;
import java.util.ArrayList;
import java.util.*;

public class sort {
public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);
  ArrayList<Integer> list=new ArrayList<>();
  System.out.print("Enter the no of elements you want to add initially:");
  int n=sc.nextInt();
 System.out.print("Enter the elements of the arraylist:");
 for (int i=0;i<n;i++) {
  list.add(sc.nextInt());
 }
 System.out.println("The elements of array list are:"+list);
 Collections.sort(list);
 System.out.println("The elements of array list after sorting in ascending order are:"+list);
 Collections.sort(list,Collections.reverseOrder());
 System.out.println("The elements of array list after sorting in descending order are:"+list);
 sc.close();

}
}