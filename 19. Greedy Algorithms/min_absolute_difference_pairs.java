/* Given two arrays A and B of equal length n. Pair each element of array A to an element
 in array B, such that sum S of absolute differences of all the pairs is minimum.
 Sample input: A=[1,2,3]
 B=[2,1,3]
 Output: ans=0
 */
// Time complexity O(nlogn) 
// Time complexity of inbuilt sort of arrays is O(nlogn)
import java.util.*;
public class min_absolute_difference_pairs {
  public static int sum(int arr1[],int arr2[]) {
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    int sum=0;
    for (int i=0;i<arr1.length;i++) {
      sum+=Math.abs(arr1[i]-arr2[i]);
    }
    return sum;
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the length of arrays:");
    int n=sc.nextInt();
    int arr1[]=new int[n];
    int arr2[]=new int[n];
    System.out.print("Enter the elements of first array:");
    for (int i=0;i<n;i++) {
        arr1[i]=sc.nextInt();
    }
    System.out.print("Enter the elements of second array:");
    for (int i=0;i<n;i++) {
        arr2[i]=sc.nextInt();
    }
    System.out.print("The minimum sum of absolute differences of all pairs is:"+sum(arr1,arr2));
    sc.close();
  }
}
