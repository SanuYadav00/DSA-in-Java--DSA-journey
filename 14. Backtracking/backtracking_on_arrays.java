// time complexity O(2n+n) = O(n)
// Space complexity O(n)

import java.util.*;
public class backtracking_on_arrays {
  static void print(int array[]) {
    System.out.print("The array elements are:");
    for (int i=0;i<array.length;i++) {
      System.out.print(" "+array[i]);
    }
    System.out.println();
  }

  public static void input(int arr[],int index) {
    
    if (index==arr.length) {
       print(arr);
      return;
    }
    arr[index]=index+1;
    input(arr,index+1);
    arr[index]-=2;
    
  }
  public static void main(String args[] ) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the total no. of elements in the array:");
    int n=sc.nextInt();
    int array[]=new int[n];
    input(array,0);
    print(array);
    sc.close();
  }
}