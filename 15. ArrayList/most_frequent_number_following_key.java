/* You are given an integer Arraylist nums. You are also 
given an integer key, which is present in nums. For every 
unique integer target in nums, count the number of times 
target immediately follows an occurrence of key in nums.
 In other words, count the number of indices i such 
 that:0 <= i <= nums.size() - 2,nums.get(i) == key and,
 nums.get(i+1) == target.
 Return the target with the maximum count.
 (Assumption- that the target with maximum count isunique.)
 Sample Input 1:nums = [1,100,200,1,100], key = 1
 Sample Output 1:  100
 Explanation :For target = 100, there are 2 occurrences at 
 indices 1 and 4 which follow an occurrence of key.No other
  integers follow an occurrence of key, so we return 100.
  Constraints:●2 <= nums.size() <= 1000●1 <= nums.get(i) <= 1000●
  Assume that the answer is unique.
  Hints: Count the number of times each target valuefollows
   the key in the arraylist.Choose the target with the maximum count and return it*/
   // time complexity O(n) or O(1000)
  import java.util.*;
public class most_frequent_number_following_key {
public static int find(ArrayList<Integer> nums, int key) {
int array[]=new int[1000];
int max=Integer.MIN_VALUE;
int value=0;

for (int i=0;i<nums.size()-1;i++) {
  if (nums.get(i)==key) {
    array[nums.get(i+1)-1]++;
  }
}
for (int i=0;i<array.length;i++) {
if (array[i]>max) {
  max=array[i];
  value=i+1;
}
}
return value;



}
  public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);
  ArrayList<Integer> nums=new ArrayList<>();
  System.out.print("Enter the no of elements you want to add initially:");
  int n=sc.nextInt();
 System.out.print("Enter the elements of the arraylist:");
 for (int i=0;i<n;i++) {
  nums.add(sc.nextInt());
 }
 System.out.println("The elements of array list are:"+nums);
 System.out.print("Enter the key:");
  int key=sc.nextInt();
 System.out.println("The most frequent number following key is:"+find(nums,key));
 sc.close();

}
}