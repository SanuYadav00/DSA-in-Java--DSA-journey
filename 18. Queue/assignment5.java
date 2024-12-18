/* Maximum of all subarrays of size k
We have an array arr[] of size N and an integer K. Find the maximum for each and every contiguous
 subarray of size K.
 Sample Input 1:N=9, K=3 arr= 1 2 3 1 4 5 2 3 6
Sample Output 1: 3 3 4 5 5 5 6 */
// Time Complexity O(n)
// Space Complexity O(n)
import java.util.*;
public class assignment5 {
  public static void maximum(int arr[],int n, int k) {
    // Create a deque to store indexes of array elements
    Deque<Integer> deque = new LinkedList<>();

    // Process first k elements separately
    for (int i = 0; i < k; i++) {
        // Remove elements smaller than the current element from the deque
        while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
            deque.pollLast();
        }
        // Add current element at the end of the deque
        deque.addLast(i);
    }

    // Process the rest of the elements
    for (int i = k; i < n; i++) {
        // The element at the front of the deque is the largest element of the previous window
        System.out.print(arr[deque.peekFirst()] + " ");

        // Remove the elements which are out of this window
        while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
            deque.pollFirst();
        }

        // Remove all elements smaller than the currently being added element (arr[i])
        while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
            deque.pollLast();
        }

        // Add current element at the end of the deque
        deque.addLast(i);
    }

    // Print the maximum element of the last window
    System.out.print(arr[deque.peekFirst()]);
}
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the no. of elements in the array:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.print("Enter the array elements:");   
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();
    }
    System.out.print("Enter the value of k (no. of elements in sub-array):");
    int k=sc.nextInt();
    System.out.println("The maximum for each and every contiguous subarray of size "+k+" are:");
    maximum(arr,n,k);
    sc.close();
  }
}

