/* Write a program to swap 2 values of an arraylist */
// Time Complexity=O(n)
import java.util.*;
import java.util.ArrayList;
public class swap_2_values {
public static void swap(ArrayList<Integer> list,int a, int b) {
  int temp=list.get(a);
  list.set(a,list.get(b));
  list.set(b,temp);
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
 System.out.print("Enter the index of first value which you want to swap:");
  int a=sc.nextInt();
  System.out.print("Enter the index of second value which you want to swap:");
  int b=sc.nextInt();

 swap(list,a,b);
 System.out.println("The elements of array list after swap are:"+list);
 sc.close();

}
}
