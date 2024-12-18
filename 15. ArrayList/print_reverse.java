/* Write a program to print the reverse of an arraylist */
// Time Complexity=O(n)
import java.util.*;
import java.util.ArrayList;
public class print_reverse {
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
 System.out.println("The elements of array list after reverse are:");
 for (int i=list.size()-1;i>=0;i--) {
  System.out.print(" "+list.get(i));
 }
 System.out.println();
 sc.close();

}
}