/* Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104 */
import java.util.*;
public class search_insert_position {
  public static int searchInsert(int[] nums, int target) {
    int start=0;
     int end=nums.length-1;      
     int position=-1;
    while (start<=end) {
      int mid=(start+end)/2;
       if (target==nums[mid]) {
        return mid;
       }
       else if (target<nums[mid]) {
        position=mid;
        end=mid-1;
       }
       else {
        start=mid+1;
        position=end+1;
       }
    }
    return position;
    }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of the array:");
    int n=sc.nextInt();
    int numbers[]=new int[n];
    System.out.print("Enter the elements of the array:");
    for (int i=0;i<numbers.length;i++) {
        numbers[i]=sc.nextInt();
    }
    System.out.print("Enter the target element:");
        int target=sc.nextInt();
        int b=searchInsert(numbers,target);
        System.out.println("The insert position is:"+b);

    sc.close();
  }
}
