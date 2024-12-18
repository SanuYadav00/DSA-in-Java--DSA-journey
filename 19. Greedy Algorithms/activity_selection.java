/* You are given n activities with their start and end times. Select the maximum number of
 activities that can be performed by a single person, assuming
 that a person can only work on a single activity at a time.
Activities are sorted according to end time.
 input: start=[10,12,20]
        end=[20,25,30]
  Output=2(A0 & A2)      
 */
// Time Complexity O(n)
// Space Complexity
import java.util.*;
public class activity_selection {
      public static int maximum(int stime[],int etime[]) {
         // end time basis sorted
            int max=0;
         ArrayList<Integer> ans=new ArrayList<>();

         // 1st activity sorted
         max=1;
         ans.add(0);
         int lastEnd=etime[0];
         for (int i=1;i<etime.length;i++) {
            if (stime[i]>=lastEnd) {
                  // activity select
                  ans.add(i);
                  max++;
                  lastEnd=etime[i];
            }
         }
         System.out.print("The activities that can be performed are:");
         for (int i=0;i<ans.size();i++) {
            System.out.print(" A"+ans.get(i)+",");
         }
         System.out.println();
         return max;

      }
      public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the total no. of activities:");
            int n=sc.nextInt();
            int start_time[]=new int[n];
            int end_time[]=new int[n];
            System.out.print("Enter the start time of all the activities:");
            for (int i=0;i<n;i++) {
                  start_time[i]=sc.nextInt();
            }
            System.out.print("Enter the end time of all the activities:");
            for (int i=0;i<n;i++) {
                  end_time[i]=sc.nextInt();
            }
            System.out.println("The maximum number of activities that can be performed is:"+maximum(start_time,end_time));
            sc.close();

      }
}