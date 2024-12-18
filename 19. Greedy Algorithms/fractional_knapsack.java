/* Given the weights and values of N items, put these items in a knapsack 
of capacity W to get the maximum total value in the knapsack
 input: value=[60,100,120]
        weight=[10,20,30]
        W=50
  ans=240      
 */
// Time Complexity O(nlogn)
// Space Complexity
import java.util.*;
public class fractional_knapsack {
      public static double maximum(int weights[],int values[],double w) {
         double ratio[][]=new double[weights.length][2];
         for (int i=0;i<weights.length;i++) {
            ratio[i][0]=i;
            ratio[i][1]=(values[i]/(double)weights[i]);
         }
         Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
         double max=0;
         int k=weights.length-1;
         while(w>0) {
            if (w>weights[(int)ratio[k][0]]) {
                  max=max+values[(int)ratio[k][0]];
                  w=w-weights[(int)ratio[k][0]];
                  k--;
            } else {
                  max=max+(w*ratio[k][1]);
                  w=0;
            }
            

         }
         return max;

      }
      public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the total no. of items:");
            int n=sc.nextInt();
            System.out.print("Enter the total capacity of the knapsack:");
            double w=sc.nextInt();
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
            System.out.println("The maximum value in knapsack is:"+maximum(weights,values,w));
            sc.close();

      }
}