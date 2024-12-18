// TC O(n) as n+2n=3n and we ignore constants
// SC O(1)
import java.util.*;
public class next_greater_element {
  public static void find(int array[],int ng[]) {
   Stack<Integer> s=new Stack<>();
   for (int i=ng.length-1;i>=0;i--) { // For this loop O(n)
    while(!s.isEmpty() && array[i]>=s.peek()) { // for this loop O(2n) as one element can be pushed only once and it can be popped only once 
     s.pop();
    }

    if (s.isEmpty()) {
      ng[i]=-1;
    }
    else {
      ng[i]=s.peek();

    }
    s.push(array[i]);
   }
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of the array:");
    int size=sc.nextInt();
    int array[]=new int[size];
    System.out.print("Enter the elements of the array:");
    for (int i=0;i<array.length;i++) {
      array[i]=sc.nextInt();
    }
    System.out.print("The elements of the array are:");
    for (int i=0;i<array.length;i++) {
      System.out.print(array[i]+" ");
    }
    System.out.println();
    int nextGreater[]=new int[array.length];
    find(array,nextGreater);
    System.out.print("The next greater elements of the array elements are:");
    for (int i=0;i<array.length;i++) {
      System.out.print(nextGreater[i]+" ");
    }
    System.out.println();
    System.out.println("Note:-(-1 denotes no greater element exists for that particular element):");

   sc.close();
  }
  
}
