/* Write a program to find union and intersection of 2 arrays
 arr1={7,3,9}
 arr2={6,3,9,2,9,4}
 union=6 {7,3,9,6,2,4}
 intersection=2 (3,9)
 */

 import java.util.*;
public class union_intersection_of_2_arrays {
   public static void find(int arr1[],int arr2[]) {
    HashMap<Integer,Integer> hm=new HashMap<>();
     HashSet<Integer> union=new HashSet<>();
     HashSet<Integer> intersection=new HashSet<>();
     for (int i=0;i<arr1.length;i++) {
       union.add(arr1[i]);
       hm.put(arr1[i],1);
      }
      for (int i=0;i<arr2.length;i++) {
        union.add(arr2[i]);
        if (hm.containsKey(arr2[i])) {
          intersection.add(arr2[i]);
        }
       }
       System.out.println("Union="+union.size()+" "+union);
       System.out.println("Intersection="+intersection.size()+" "+intersection);
   }
   public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
      System.out.print("Enter array1 size:");
      int n1=sc.nextInt();
      int arr1[]=new int[n1];
      System.out.print("Enter array elements:");
      for (int i=0;i<n1;i++) {
       arr1[i]=sc.nextInt();
      }
      System.out.print("Enter array size:");
      int n2=sc.nextInt();
      int arr2[]=new int[n2];
      System.out.print("Enter array elements:");
      for (int i=0;i<n2;i++) {
       arr2[i]=sc.nextInt();
      }

   find(arr1,arr2);
   sc.close();
 }
 }
 