/* Connect n ropes with minimum cost
Given are N ropes of different lengths, the task is to connect
these ropes into one rope with minimum cost, such that the cost
 to connect two ropes is equal to the sum of their lengths.
 Sample Input 1: N = 4, arr = [4 3 2 6]
 Sample Output 1: 29
 Sample Input 2: N = 2, arr = [1 2 3]
 Sample Output 2: 9 */
 // Time Complexity O(n)
// Space Complexity O(n)
 import java.util.*;
public class assignment2 {
  public static int connect(int arr[]) {
   Queue<Integer> q=new PriorityQueue<Integer>();
   for (int i=0;i<arr.length;i++) {
    q.add(arr[i]);
   }
   int cost=0;
   while (q.size()>1) {
    int a=q.poll();
    int b=q.poll();
    q.add(a+b);
    cost=cost+a+b;
   }
   return cost;
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the no. of ropes:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.print("Enter the length of ropes:");   
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();
    }
    System.out.print("The minimum cost is:"+connect(arr));
    sc.close();
  }
}
