/* Write a program to count distinct elements
 num={4,3,2,5,6,7,3,4,2,1}
 ans=7
 */

import java.util.*;
public class count_distinct_elements {
  public static int count(int arr[]) {
    HashSet<Integer> hs=new HashSet<>();
    for (int i=0;i<arr.length;i++) {
      hs.add(arr[i]);
    }
    return hs.size();
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
     System.out.print("The array elements are:");
     for (int i=0;i<n;i++) {
      System.out.print(" "+arr[i]);
  }
  System.out.println();
  int a=count(arr);
  System.out.println("The total distinct elements are:"+a);
  sc.close();
}
}
