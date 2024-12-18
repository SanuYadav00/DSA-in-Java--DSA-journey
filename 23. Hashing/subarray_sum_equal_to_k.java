/* In a given array find the no. of subarrays with sum equal to k
 arr={1,2,3} k=3
 ans=2 (1,2) (3)
 */
// TC O(n)
import java.util.*;
public class subarray_sum_equal_to_k {
  public static int sum(int arr[],int k) {
    int ans=0;
    HashMap<Integer,Integer> hm=new HashMap<>();
    int sum=0;
    hm.put(0,1);
    for (int i=0;i<arr.length;i++) {
      sum+=arr[i];
      if (hm.containsKey(sum-k)) {
        ans+=hm.get(sum-k);
      }
      hm.put(sum,hm.getOrDefault(sum,0)+1);
    }
    return ans;
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
     System.out.print("Enter the value of k:");
     int k=sc.nextInt();
     int l=sum(arr,k);
     System.out.println("The total no of subarrays with sum equal to "+k+" is:"+l);
     sc.close();
}
}

