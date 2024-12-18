/* You are given an integer arraylist nums. A number x is lonely when it appears 
only once, and no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.
Return all lonely numbers in nums. You may return the answer in any order.
Sample Input 1: nums = [10,6,5,8]
Sample Output 1: [10,8]
Explanation :- 10 is a lonely number since it appears exactly once and 9
 and 11 does not appear in nums.
 -8 is a lonely number since it appears exactly once and 7 and 9 does not appear in nums.
- 5 is not a lonely number since 6 appears in nums and vice versa.
Hence, the lonely numbers in nums are [10, 8].Note that [8, 10] may also be returned.
Constraints:●1 <= nums.size() <= 105●0 <= nums.get(i) <= 106 */
// Time complexity O(n)
import java.util.*;
public class lonely_number {
public static ArrayList<Integer> check(ArrayList<Integer> list) {
ArrayList<Integer> lonelist= new ArrayList<>();
Collections.sort(list);
for (int i=1;i<list.size()-1;i++) {
  if (list.get(i-1)+1 < list.get(i) && list.get(i)+1 < list.get(i+1) ) {
    lonelist.add(list.get(i));
  }
}
if (list.size() ==1) { 
lonelist.add(list.get(0));
}
if (list.size() >1) {
  if(list.get(0) +1 < list.get(1)) { 
    lonelist.add(list.get(0));
  }
  if (list.get(list.size()-2) +1 < list.get(list.size()-1)) {
    lonelist.add(list.get(list.size()-1));
  }
}
return lonelist;


 /*  for (int i=0;i<list.size();i++) {
    boolean alone=true;
    for (int j=0;j<list.size();j++) {
   if (i==j) {
    continue;
   }
    if ((list.get(i)==list.get(j)) || (list.get(i)-list.get(j)==1) || list.get(j)-list.get(i)==1 ) {
      alone=false;
    }
    
    }
    if (alone==true) {
      System.out.print(" "+list.get(i));
    }

  } */
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
 System.out.println("The lonely numbers are:"+check(list));
 sc.close();

}
}
