/* In a given array find the largest subarray with 0 sum
 arr={15,-2,2,-8,1,7,10,23}
 ans=5

 arr={3,4,5}
 ans=0;
 */
// TC O(n)
import java.util.*;
public class largest_subarray_with_0_sum {
  public static int largest(int arr[]) {
    int max=0;
    HashMap<Integer,Integer> hm=new HashMap<>();
    int sum=0;
    for (int i=0;i<arr.length;i++) {
      sum+=arr[i];
      if (hm.containsKey(sum)) {
        max=Math.max(max,i-hm.get(sum));
      }
      else {
      hm.put(sum,i);
      }

    }
    return max;
  }
  public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter array size:");
     int n=sc.nextInt();
     int arr[]=new int[n];
     System.out.print("Enter array elements:");
     for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();
     }
     int l=largest(arr);
     System.out.println("The largest subarray with sum 0 is:"+l);
     sc.close();
}
}
