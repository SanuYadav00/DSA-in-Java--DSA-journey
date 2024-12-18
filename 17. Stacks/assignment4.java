/*Trapping Rain Water
We have an array of N non-negative integers arr[] 
representing an elevation map where the width of each
 bar is 1, compute how much water it is able to trap after
  raining.
  Note: We have already solved this Question using Arrays
  but you have to now solve this using a Stack.
  Sample Input 1:[7 0 4 2 5 0 6 4 0 6]
  Sample Output 1: 25 */
/*TC O(n)
 * SC O(n)
 */
import java.util.*;
public class assignment4 {
  public static int maxWater(int a[]) {
    Stack<Integer> s=new Stack<>();
    int n=a.length;
    int ans=0;
    for (int i=0;i<n;i++) {
      while(!s.isEmpty() && (a[s.peek()]<a[i])) {
        int pop_height=a[s.peek()];
        s.pop();
        if(s.isEmpty()) {
          break;
        }
        int distance=i-s.peek()-1;
        int min_height=Math.min(a[s.peek()],a[i])-pop_height;
        ans+=distance*min_height;
      }
      s.push(i);
    }
     return ans;


  }
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the no. of bars:");
    int n=sc.nextInt();
    // System.out.print("Enter the width of each bar:");
    // int width=sc.nextInt();
    int arr[]=new int[n];
    System.out.print("Enter the height of the bars:");
    for (int i=0;i<n;i++) {
       arr[i]=sc.nextInt();
    }
    System.out.println();
    
    System.out.println("The total water trapped is:"+maxWater(arr));
    sc.close();
  }
  
}
