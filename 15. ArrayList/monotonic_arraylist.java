/* An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
An Arraylist nums is monotone increasing iff or all i<=j, nums.get(i)<=nums.get(j).
An Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
Given an integer Arraylist nums, return true if the given list is monotonic,
 or false otherwise.
 Sample Input 1: nums = [1,2,2,3]
 Sample Output 1: true
 Sample Input 2: nums = [6,5,4,4]
 Sample Output 2: true
 Sample Input 3: nums = [1,3,2]
 Sample Output 3: false
 Constraints:●1 <= nums.size() <= 105●-105 <= nums.get(i) <= 105 */
 /* An array is said to be monotonic if its elements, from left to right, 
 are entirely non-increasing or entirely non-decreasing. Monotone means continiously */
 // Time Complexity=O(n)
import java.util.*;
import java.util.ArrayList;
public class monotonic_arraylist {
public static boolean check(ArrayList<Integer> list) {

  boolean inc=true;
  boolean dec=true;
  for (int i=0;i<list.size()-1;i++) {
    if (list.get(i)>list.get(i+1)) {
      inc=false;
    }
    if (list.get(i)<list.get(i+1)) {
      dec=false;
    }
  }
    return inc||dec ;
  /* if (list.get(0)<list.get(1)) {
  for (int i=1;i<list.size()-1;i++) {
    if (list.get(i)>list.get(i+1)) {
      return false;
    }
  }
}
else if(list.get(0)>list.get(1)) {
  for (int i=1;i<list.size()-1;i++) {
    if (list.get(i)<list.get(i+1)) {
      return false;
    }
  }
}
  return true; */
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
 System.out.println("The ArrayList is monotonic:"+ check(list));
 sc.close();

}
}
