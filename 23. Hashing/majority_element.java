/* Given an integer array of size n, find all elements that appear more than n/3 times
 nums[]={1,3,2,5,1,3,1,5,1} // 1
 nums[]={1,2} // 1,2
 */
// time complexity O(n) due to the loops 
import java.util.*;
public class majority_element {
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
     System.out.print("Enter array size:");
     int n=sc.nextInt();
     int arr[]=new int[n];
     HashMap<Integer,Integer> hm=new HashMap<>();
     System.out.print("Enter array elements:");
     for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();
     }
     System.out.print("The array elements are:");
     for (int i=0;i<n;i++) {
      System.out.print(" "+arr[i]);
      // if (!hm.containsKey(arr[i])) {
      //   hm.put(arr[i],1);
      // }
      // else {
      //   hm.put(arr[i],hm.get(arr[i])+1);
      // }
      hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
     }
     System.out.println();
     System.out.println("All the elements which appear more than n/3 times are:");
    //  Set<Integer> keys=hm.keySet();
    //  for (int k:keys) {
    //   if (hm.get(k)>n/3) {
    //     System.out.println("key="+k+" value="+hm.get(k));
    //   }
    //  }
     for (int k:hm.keySet()) {
      if (hm.get(k)>n/3) {
        System.out.println("key="+k+" value="+hm.get(k));
      }
     }
     sc.close();
  }
}