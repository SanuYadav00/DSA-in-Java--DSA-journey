/* Write a program to print the maximum value of an arraylist */
// Time Complexity=O(n)
import java.util.*;
import java.util.ArrayList;
public class maximum {
public static int maximum1(ArrayList<Integer> list) {
  int max=Integer.MIN_VALUE;
  for (int i=0;i<list.size();i++) {
    max=Math.max(max,list.get(i));
  }
  return max;
}
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
 int max= maximum1(list);
 System.out.println("The maximum element of the list is:"+max);
 sc.close();

}
}
