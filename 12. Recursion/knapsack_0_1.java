/* Given the weights and values of N items, put these items in a knapsack 
of capacity W to get the maximum total value in the knapsack. You can either 
put the whole item or skip the item.      
 */
// Time Complexity O(2^n)
// Space Complexity
import java.util.*;
public class knapsack_0_1 {
      public static int maximum(int weights[],int values[],int w,int n) {
         if (w==0 || n==0) {
            return 0;
         }
         if (weights[n-1]<=w) {
            // include
            int ans1=values[n-1]+maximum(weights,values,w-weights[n-1],n-1);

            // exclude
            int ans2=maximum(weights,values,w,n-1);

            return Math.max(ans1,ans2);
         }
         else {
            return maximum(weights,values,w,n-1);
         }

      }
      public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the total no. of items:");
            int n=sc.nextInt();
            System.out.print("Enter the total capacity of the knapsack:");
            int w=sc.nextInt();
            int weights[]=new int[n];
            int values[]=new int[n];
            System.out.print("Enter the weight of all the items:");
            for (int i=0;i<n;i++) {
                  weights[i]=sc.nextInt();
            }
            System.out.print("Enter the values of all items:");
            for (int i=0;i<n;i++) {
                  values[i]=sc.nextInt();
            }
            System.out.println("The maximum value in knapsack is:"+maximum(weights,values,w,n));
            sc.close();

      }
}